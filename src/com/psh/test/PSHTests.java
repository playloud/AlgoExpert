package com.psh.test;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class PSHTests {

    public interface iPSH01 {
        public void doSomething01();

        void doMan();
    }

    public interface iPSH02 extends iPSH01 {
        public void doSomething01();
    }

    public class Gen1 implements iPSH01 {
        @Override
        public void doSomething01() {
            System.out.println("doS01");
        }

        public void doMan() {
            System.out.println("doman_gen1");
        }
    }

    public class Gen2 implements iPSH02 {
        @Override
        public void doSomething01() {
            System.out.println("doSome_02");
        }

        public void doMan() {
            System.out.println("doman_gen2");
        }
    }

    @Test
    public void testsss() {
        System.out.println("abc".substring(1));
    }

    @Test
    public void testInterface() {
        iPSH01 eewe = new Gen2();
        eewe.doSomething01();
        eewe.doMan();

        // nonsense
        //iPSH02 eewe2 = new Gen1();
        //eewe2.doSomething01();

        //Gen1 g1 = new Gen2();

    }


    @Test
    public void testArr() {
        var arr = new ArrayList<Character>();
        arr.add('a');
        arr.add('b');
        arr.add('c');
        Character[] ccc = new Character[arr.size()];
        ccc = arr.toArray(ccc);
        System.out.println(ccc);
        //System.out.println(new String(ccc));
    }

    @Test
    public void subStr() {
        String a = "0123456789";
        for (int i = 0; i <= a.length(); i++) {
            System.out.println(i + "=>" + a.substring(0, i));
            System.out.println(i + "=>" + a.substring(i));
            System.out.println();
        }
    }

    @Test
    public void testStream01() {
        //IntStream.range(0, 10).forEach(a-> System.out.println(a));
        IntStream.range(0, 10).filter(a -> a % 2 == 0).forEach(a -> System.out.println(a));
    }

    @Test
    public void testStream_limit() {
        IntStream.range(0, 100).filter(a -> a % 2 == 0).limit(10).forEach(a -> System.out.println(a));
    }

    @Test
    public void testStream_reduce() {
        var ss = IntStream.range(0, 100).filter(a -> a % 2 == 0).limit(10);
        ss.forEach(a -> {
            System.out.println(a);
        });
        var ss2 = IntStream.range(0, 100).filter(a -> a % 2 == 0).limit(10);
        var result = ss2.reduce(Integer::sum).getAsInt();
        System.out.println(result);
    }

    @Test
    public void testStream_sort() {
        var ss = new ArrayList<PSHTest>();
        ss.add(new PSHTest(3, "three"));
        ss.add(new PSHTest(0, "zero"));
        ss.add(new PSHTest(4, "four"));
        ss.add(new PSHTest(1, "one"));
        ss.add(new PSHTest(2, "two"));

        ss.stream().sorted((o1, o2) -> {
            if (o1.value > o2.value) return 1;
            else if (o1.value == o2.value) return 0;
            else return -1;
        }).forEach(a -> {
            System.out.println(a);
        });

    }

    @Test
    public void testCollection() {
        var tm = new TreeMap<String, String>();
        tm.put("hello", "world");
        tm.put("hello", "world2");
        System.out.println(tm.get("hello"));

        var hs = new HashMap<String, String>();
        hs.put("hello", "world");
        hs.put("hello", "world2");
        System.out.println(hs.get("hello"));
    }

    class PSHTest {
        int value = 0;
        String name = null;

        public PSHTest(int value, String name) {
            this.value = value;
            this.name = name;
        }

        @Override
        public String toString() {
            return "PSHTest{" +
                    "value=" + value +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Test
    public void test_covert_ArrayListToArray() {
        var arrList = new ArrayList<Integer>();
        IntStream.range(0, 100).forEach(a -> arrList.add(a));
        //this is only way to covert
        var arr = arrList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test_dates() throws Exception {
        var sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("days between:" + daysBetweenDates(sdf.parse("1978-01-14"), new Date()));
        System.out.println("years between:" + daysBetweenDates(sdf.parse("1978-01-14"), new Date()) / 365);
    }

    public int daysBetweenDates(Date d1, Date d2) {
        long diff = d1.getTime() - d2.getTime();
        long daysDiff = TimeUnit.DAYS.convert(Math.abs(diff), TimeUnit.MILLISECONDS);
        return (int) daysDiff;
    }

    @Test
    public void testHMap() {
        //THIS IS NOT WORKING!!
        var myMap = new HashMap<int[], String>();
        var myKey = new int[]{1,2};
        myMap.put(myKey, "this is testtest");
        System.out.println(myMap.get(new int[]{1, 2}));
        System.out.println(myMap.get(myKey));
    }


}
