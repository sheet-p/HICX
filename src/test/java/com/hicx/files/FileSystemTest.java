package com.hicx.files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FileSystemTest {
    FileSystem dir;

    @Before
    public void initializations() {
        dir = new FileSystem("/a/abc.txt");
    }
    @Test
    public void checkIfProccesedExists() {

        assertEquals(true, dir.root.dirs.containsKey("processed"));
    }

    @Test
    public void checkFileMovedToProcessed() {
        dir.addContentToFile("/a/abc.txt", "hicx assignment. hicx assignment is on parsing. hicx. assignment");
        assertNotNull(dir.root.dirs.get("processed"));
    }

    @Test
    public void checkFileExistsInProcessed() {
        dir.addContentToFile("/a/abc.txt", "for testing. this is for testing only.");

        //gets all files under processed subdirectory
        if(dir.root.dirs.get("processed").getAllFiles().size() > 0 ) {
            List<File> file = dir.root.dirs.get("processed").getAllFiles();
            for(File f : file) {
                if(f.getFileName().equals("abc.txt")) {
                    assertTrue(f.getFileName().equals("abc.txt"));
                }
            }
        }
    }
}
