package com.psh.leetcode.ms;
import java.util.*;
import java.util.stream.Collectors;

//Input
//["FileSystem", "ls", "mkdir", "addContentToFile", "ls", "readContentFromFile"]
//[[],           ["/"], ["/a/b/c"], ["/a/b/c/d", "hello"], ["/"], ["/a/b/c/d"]]
//Output
//[null, [], null, null, ["a"], "hello"]
public class FileSystem {

    Dir root = null;

    public FileSystem() {
        root = new Dir(".");
    }

    public List<String> ls(String path) {
        var result = new ArrayList<String>();
        String[] pathes = path.split("/");
        if (pathes.length == 0 ) {
            // getting root's directories
            root.dirs.forEach(a->{
                System.out.println(a.name);
                result.add(a.name);
            });
        } else {
            Dir curDir = root;
            // iterate
            for (int i = 0; i < pathes.length; i++) {
                String curPath = pathes[i];
                if (curPath.equals(""))
                    continue;

                if(i== pathes.length-1) {
                    if(curDir.files.stream().anyMatch(a->a.name.equals(curPath))) {
                        // fileName
                        result.add(curPath);
                        return result;
                    } else {
                        if(curDir.dirs.stream().anyMatch(a->a.name.equals(curPath))) {
                            Dir pp = curDir.dirs.stream().filter(a->a.name.equals(curPath)).collect(Collectors.toList()).get(0);
                            curDir = pp;
                        } else {
                            return result;
                        }
                    }
                } else {
                    if(curDir.dirs.stream().filter(a->a.name.equals(curPath)).count() > 0) {
                        Dir pp = curDir.dirs.stream().filter(a->a.name.equals(curPath)).collect(Collectors.toList()).get(0);
                        curDir = pp;
                    } else {
                        return result;
                    }
                }
            }

            curDir.dirs.forEach(a->{
                result.add(a.name);
            });
        }
        result.sort(Comparator.naturalOrder());
        return result;
    }

    public void mkdir(String path) {
        String[] pathes = path.split("/");
        if (pathes.length > 0 ) {
            // getting root's directories
            Dir curDir = root;
            // iterate
            for (String curPath : pathes) {
                if(curPath.equals("")) continue;
                if(curDir.dirs.stream().filter(a->a.name.equals(curPath)).count() > 0) {
                    Dir pp = curDir
                            .dirs
                            .stream()
                            .filter(a->a.name.equals(curPath))
                            .collect(Collectors.toList())
                            .get(0);
                    curDir = pp;
                } else {
                    Dir newDir = new Dir(curPath);
                    curDir.dirs.add(newDir);
                    curDir = newDir;
                }
            }
        }
    }

    public void addContentToFile(String filePath, String content) {
        String[] pathes = filePath.split("/");
        String fileName = pathes[pathes.length-1];
        
        File newFile = new File(fileName, content);
        Dir curDir = root;
        for (int i = 0; i < pathes.length -1; i++) {
            String curDirStr = pathes[i];
            if(curDirStr.equals(""))continue;
            if(curDir.dirs.stream().filter(a->a.name.equals(curDirStr)).count() > 0) {
                Dir pp = curDir.dirs.stream().filter(a->a.name.equals(curDirStr)).collect(Collectors.toList()).get(0);
                curDir = pp;
            } else {
                Dir newDir = new Dir(curDirStr);
                curDir.dirs.add(newDir);
                curDir = newDir;
            }
        }
        if(curDir.files.stream().filter(f->f.name.equals(fileName)).count() > 0) {
            curDir.files.stream().filter(f->f.name.equals(fileName)).collect(Collectors.toList()).get(0).content += content;
        } else {
            curDir.files.add(newFile);
        }
        // todo : what if file is existing?
    }

    public String readContentFromFile(String filePath) {
        String[] pathes = filePath.split("/");
        String fileName = pathes[pathes.length-1];
        Dir curDir = root;
        for (int i = 0; i < pathes.length -1; i++) {
            String curDirStr = pathes[i];
            if(curDirStr.equals(""))continue;
            if(curDir.dirs.stream().filter(a->a.name.equals(curDirStr)).count() > 0) {
                Dir pp = curDir.dirs.stream().filter(a->a.name.equals(curDirStr)).collect(Collectors.toList()).get(0);
                curDir = pp;
            } else {
                return null;
            }
        }
        if(curDir.files.stream().filter(f->f.name.equals(fileName)).count() > 0) {
            File targetFile = curDir.files.stream().filter(f->f.name.equals(fileName)).collect(Collectors.toList()).get(0);
            return targetFile.content;
        }
        return null;
    }
}

class Dir {
    ArrayList<Dir> dirs = null;
    ArrayList<File> files = null;
    String name = null;
    public Dir(String name) {
        this.name = name;
        dirs = new ArrayList<>();
        files = new ArrayList<>();
    }

    public void addFile(String name, String contents) {

    }

}
class File {
    String name = null, content = null;
    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }
}



/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * List<String> param_1 = obj.ls(path);
 * obj.mkdir(path);
 * obj.addContentToFile(filePath,content);
 * String param_4 = obj.readContentFromFile(filePath);
 */
