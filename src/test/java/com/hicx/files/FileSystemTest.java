package com.hicx.files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FileSystemTest {
    @Test
    public void checkIfProccesedExists() {
        FileSystem dir = new FileSystem();

        assertEquals(true, dir.root.dirs.containsKey("processed"));
    }

    @Test
    public void checkFileMovedToProcessed() {
        FileSystem dir = new FileSystem("/a/abc.txt");
        dir.addContentToFile("/a/abc.txt", "hicx assignment. hicx assignment is on parsing. hicx. assignment");
        assertNotNull(dir.root.dirs.get("processed"));
    }
}
