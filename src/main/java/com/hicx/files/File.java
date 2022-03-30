package com.hicx.files;

public class File {
    String name;
    String content;

    File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    //getters
    public String getFileName() {
        return name;
    }

    public String getFileContent() {
        return content;
    }

    //setters
    public void setFileContent(String contents) {
        this.content = contents;
    }

    public void setFileName(String fName) {
        this.content = fName;
    }
}