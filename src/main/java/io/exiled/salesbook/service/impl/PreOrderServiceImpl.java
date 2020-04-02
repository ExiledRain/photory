package io.exiled.salesbook.service.impl;

import io.exiled.salesbook.service.PreOrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;
import java.util.List;

@Service("preOrder")
public class PreOrderServiceImpl implements PreOrderService {
    @Value("{preOrder.path}")

    @Override
    public String buildLink(String link) {
        return "";
    }

    @Override
    public List<String> findFolders(String path) {
        String completePath = "" + path;
        File file = new File(completePath);

        try {
            Files.walkFileTree(file.toPath(), Collections.emptySet(), 1, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    System.out.println(file);
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            System.err.println("findFolders ERROR: " + e.getMessage());
        }
        return null;
    }
}















