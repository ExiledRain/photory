package io.exiled.salesbook.service.impl;

import io.exiled.salesbook.service.PreOrderService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service("preOrder")
public class PreOrderServiceImpl implements PreOrderService {
    private List<String> folderList = new ArrayList<>();

    @Value("${preOrder.path}")
    private String preOrderPath;

    @Override
    public String buildLink(String link) {
        return "";
    }

    @Override
    public List<String> findFolders(String path) {
        String completePath = preOrderPath;
//        File file = new File(completePath);

        List<File> files = (List<File>) FileUtils.listFiles(new File(completePath), null, false);
//        files.stream()
//                .filter(File::isDirectory)
//                .forEach(System.out::println);

        files.forEach(System.err::println);
        return new ArrayList<>();
    }

    public void buildFilePaths(String dir) {
        String updatedPath = preOrderPath + dir;
        if (!dir.isEmpty()) {
            Stream.of(Objects.requireNonNull(new File(updatedPath).listFiles()))
                    .filter(File::isDirectory)
                    .forEach(x -> folderList.add(x.getPath()));
//                .map(File::getName)
//                .collect(Collectors.toSet());
        } else {
            Stream.of(Objects.requireNonNull(new File(preOrderPath).listFiles()))
                    .filter(File::isDirectory)
                    .forEach(x -> folderList.add(x.getPath()));
        }
    }

    public List<String> getFolderList() {
        return folderList;
    }
}















