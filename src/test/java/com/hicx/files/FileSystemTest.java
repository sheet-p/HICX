package com.hicx.files;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FileSystemTest {
    @Test
    public void checkIfProccesedExists() {
        FileSystem dir = new FileSystem();

        assertEquals(true, dir.root.dirs.containsKey("processed"));
    }
}
