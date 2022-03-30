package com.hicx.files;

public class FileSystem {
    Directory root;

    FileSystem() {
        root = new Directory();

        //create subdirectory for tracking proessed files
        root.dirs.put("processed", new Directory());
    }

    FileSystem(String path) {
        mkdir(path);

        //if path contains a file
        if(path.contains(".")) {
            mkFile(path);
        }
    }

    private void mkdir(String path) {
        Directory dir = root;

        //splitting the path to get the directory names
        String[] d = path.split("/");

        for(int i=1; i<d.length; i++) {
            if(! dir.dirs.containsKey(d[i])) {
                dir.dirs.put(d[i], new Directory());
            }

            dir =dir.dirs.get(d[i]);
        }
    }

    private void mkFile(String path) {
        Directory dir = root;

        String[] d = path.split("/");

        for(int i=1; i<d.length; i++) {
            //directory
            if(! d[i].contains("."))
                dir = dir.dirs.get(d[i]);
            
            //file
            else {
                String ext = d[i].substring(d[i].indexOf("."));
                //only create the file if it is a valid extension
                if(Extension.contains(ext)) {
                    dir.files.add(new File(d[i], ""));
                }
            }
        }
    }

    public void addContentToFile(String path, String contents) {
        Directory dir = root;

        String[] d= path.split("/");

        for(int i=1; i<d.length; i++) {
            //directory
            if(! d[i].contains("."))
                dir = dir.dirs.get(d[i]);
            
            //file
            else {
                //getting index of file
                for(int j=0; j<dir.files.size(); j++) {
                    String fileName = dir.files.get(j).getFileName();
                    if(fileName.equals(d[i])) {
                        dir.files.get(j).setFileContent(contents);
                        stats(path);

                        //move file to processed folder
                        root.dirs.get("processed").files.add(new File(d[i], ""));
                    }
                }
            }
        }
    }

    public void stats(String path) {
        Directory dir = root;

        String[] d = path.split("/");

        for(int i=1; i<d.length; i++) {
            //directory
            if(! d[i].contains("."))
                dir = dir.dirs.get(d[i]);
            
            //file
            else {
                //getting index of file
                for(int j=0; j<dir.files.size(); j++) {
                    String fileName = dir.files.get(j).getFileName();
                    if(fileName.equals(d[i])) {
                        System.out.println("Number of words in File " + d[i] + " : " + Statistics.calcWords(dir.files.get(j).getFileContent()));
                        System.out.println("Number of dots in File " + d[i] + " : " + Statistics.calcDots(dir.files.get(j).getFileContent()));
                        System.out.println("Most used word in File " + d[i] + " : " + Statistics.mostUsedWord(dir.files.get(j).getFileContent()));
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        FileSystem newDir = new FileSystem("/a/b/c");
        newDir.mkFile("/a/b/c/Sheet.txt");
        newDir.addContentToFile("/a/b/c/Sheet.txt", "HICX Assignment");
    }
}
