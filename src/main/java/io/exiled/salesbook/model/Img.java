package io.exiled.salesbook.model;

public class Img {
    private String path;
    private String name;

    public Img(String path, String name) {
        this.path = path;
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }
}
