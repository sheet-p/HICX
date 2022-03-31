package com.hicx.files;

public class File {
    String name;
    String content;
    Extension fileType;

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

    public String getFileExtension() {
        return fileType.toString();
    }

    //setters
    public void setFileContent(String contents) {
        this.content = contents;
    }

    public void setFileName(String fName) {
        this.content = fName;
    }

    public void setFileExtension() {
        //since currently only txt is supported
        this.fileType = Extension.txt;
    }
}