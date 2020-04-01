package io.exiled.salesbook.service.impl;

import io.exiled.salesbook.model.Linker;
import io.exiled.salesbook.service.LinkerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class LinkerServiceImpl implements LinkerService {
//    @Value("${photory.path}")
    private String rootPath = "/home/exile/dev/Photory/Linker/Tallinn Trophy";

    private String fullPath = "/home/exile/dev/Photory/Linker/Tallinn Trophy";

    private StringBuilder fullLink = new StringBuilder("").append(rootPath);
    private StringBuilder shortPath = new StringBuilder("");

    public List<Linker> buildLinks(String root) {
        List<Linker> links = new ArrayList<>();
        if (root.endsWith(".css")) {
            root = "";
        }
//        String updatedLink = fullPath + createLink(root);
        String updatedLink = fullPath + root;
        try {
            if (!root.isEmpty()) {
//                Files.list(Paths.get(updatedLink))
//                        .filter(Files::isDirectory)
//                        .forEach(f -> links.add(new Linker(f.toString().substring(fullPath.length() + 1), f.toString().substring(fullPath.length() + 1))));
                Files.list(Paths.get(updatedLink))
                        .filter(Files::isDirectory)
                        .forEach(f -> links.add(new Linker(f.toString().substring(fullPath.length() + 1), f.toString().substring(fullPath.length() + 1))));
            } else {
                Files.list(Paths.get(rootPath))
                        .filter(Files::isDirectory)
                        .forEach(f -> links.add(new Linker(f.toString().substring(fullPath.length() + 1), f.toString().substring(fullPath.length() + 1))));
            }
        } catch (Exception e) {
            System.err.println("Error in BuildLinks Method " + e.getMessage());
        }
        return links;
    }

    @Deprecated
    private String createLink(String addition) {
        StringBuilder createdLink = new StringBuilder("").append(fullLink);
        if (shortPath.toString().contains(addition)) {
            createdLink.append(shortPath.substring(0, shortPath.indexOf(addition) + addition.length()));
        } else {
            createdLink.append(shortPath.append("/").append(addition));
        }
//        this.fullPath = fullPath + shortPath;
        return createdLink.toString();
    }
}


















