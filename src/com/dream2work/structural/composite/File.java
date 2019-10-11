package com.dream2work.structural.composite;

public abstract class File {

    private String name;

    public File(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void ls();
    public abstract void addFile(File file);
    public abstract void removeFile(File file);
    public abstract File[] getFiles();
}
