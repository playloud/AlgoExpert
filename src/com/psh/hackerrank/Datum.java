package com.psh.hackerrank;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

//import java.time.OffsetDateTime;

public class Datum {
    private long id;
    private String username;
    private String about;
    private long submitted;
    private Date updatedAt;
    private long submissionCount;
    private long commentCount;
    private long createdAt;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("username")
    public String getUsername() { return username; }
    @JsonProperty("username")
    public void setUsername(String value) { this.username = value; }

    @JsonProperty("about")
    public String getAbout() { return about; }
    @JsonProperty("about")
    public void setAbout(String value) { this.about = value; }

    @JsonProperty("submitted")
    public long getSubmitted() { return submitted; }
    @JsonProperty("submitted")
    public void setSubmitted(long value) { this.submitted = value; }

    @JsonProperty("updated_at")
    public Date getUpdatedAt() { return updatedAt; }
    @JsonProperty("updated_at")
    public void setUpdatedAt(Date value) { this.updatedAt = value; }

    @JsonProperty("submission_count")
    public long getSubmissionCount() { return submissionCount; }
    @JsonProperty("submission_count")
    public void setSubmissionCount(long value) { this.submissionCount = value; }

    @JsonProperty("comment_count")
    public long getCommentCount() { return commentCount; }
    @JsonProperty("comment_count")
    public void setCommentCount(long value) { this.commentCount = value; }

    @JsonProperty("created_at")
    public long getCreatedAt() { return createdAt; }
    @JsonProperty("created_at")
    public void setCreatedAt(long value) { this.createdAt = value; }
}
