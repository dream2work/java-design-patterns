package com.dream2work.structural.composite;

import javax.naming.OperationNotSupportedException;

public class BinaryFile extends File {
    private int size;

    public BinaryFile(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("addFile is not supported");
    }

    @Override
    public void removeFile(File file) {
        throw new UnsupportedOperationException("removeFile is not supported");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("getFiles is not supported");
    }
}
