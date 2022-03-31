package com.hicx.files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

    }
}
