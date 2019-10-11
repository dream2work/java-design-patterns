package com.dream2work.structural.composite;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Directory extends File {

    private List<File> children;

    public Directory(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    @Override
    public void ls() {
        System.out.println(getName());
        children.forEach(File::ls);
    }

    @Override
    public void addFile(File file) {
        children.add(file);
    }

    @Override
    public void removeFile(File file) {
        children.remove(file);
    }

    @Override
    public File[] getFiles() {
        return children.toArray(new File[children.size()]);
    }
}
