package com.hicx.files;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory {
    Map<String, Directory> dirs = new HashMap<>();
    List<File> files = new ArrayList<File>();

    //getters
    public List<File> getAllFiles() {
        return this.files;
    }
}
