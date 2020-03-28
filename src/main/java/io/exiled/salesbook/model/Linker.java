package io.exiled.salesbook.model;

public class Linker {
    private String linkName;
    private String shortLink;

    public Linker(String linkName, String shortLink) {
        this.linkName = linkName;
        this.shortLink = shortLink;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }
}
