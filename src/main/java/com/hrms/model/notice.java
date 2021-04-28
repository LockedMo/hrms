package com.hrms.model;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 12:20
 */
public class notice {
    private String notId;
    private String title;
    private String author;
    private String time;
    private String content;

    public String getNotId() {
        return notId;
    }

    public void setNotId(String notId) {
        this.notId = notId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "notice{" +
                "notId='" + notId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", time='" + time + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
