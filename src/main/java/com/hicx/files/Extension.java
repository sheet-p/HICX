package com.hicx.files;

public enum Extension {
    pdf,
    txt,
    doc,
    docx;

    public static boolean contains(String ext) {
        for(Extension code : values()) {
            if(code.name().equals(ext))
                return true;
        }

        return false;
    }
}
