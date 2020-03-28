package io.exiled.salesbook.service;

import io.exiled.salesbook.model.Linker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service("linker")
public class LinkerService {

    @Autowired
    private PhotoryService service;

    @Value("${photory.path}")
    private String rootPath;

    private StringBuilder shortPath = new StringBuilder("");

    public List<Linker> getFolders(String root) {
        List<Linker> folders = new ArrayList<>();

//        try {
//            Files.list(Paths.get(root))
//                    .filter(Files::isDirectory)
//                    .forEach(f -> folders.add(f.toString().substring(root.length() + 1)));
//        } catch (Exception e) {
//            System.err.println("Error in get paths");
//            e.printStackTrace();
//        }
        if (root.equals(rootPath)) {
            try {
                Files.list(Paths.get(root))
                        .filter(Files::isDirectory)
                        .forEach(f -> folders.add(new Linker(f.toString().substring(root.length() + 1), f.toString().substring(root.length() + 1))));
            } catch (Exception e) {
                System.err.println("Error in get paths");
                e.printStackTrace();
            }
        } else {
            try {
                Files.list(Paths.get(rootPath + root))
                        .filter(Files::isDirectory)
                        .forEach(f -> folders.add(new Linker(root, f.toString().substring(root.length() + 1))));
            } catch (Exception e) {
                System.err.println("Error in get paths");
                e.printStackTrace();
            }
        }
        return folders;
    }

//    public List<String> getRootPath(String root) {
//        List<String> paths = new ArrayList<>();
//        try {
//            Files.list(Paths.get(root))
//                    .filter(Files::isDirectory)
//                    .forEach(f -> paths.add(f.toString().substring(rootPath.length() + 1)));
//        } catch (Exception e) {
//            System.err.println("Error in get paths");
//            e.printStackTrace();
//        }
//        return paths;
//    }

//    public String updateLink(String additional) {
//        int len = this.rootPath.length();
//        if(this.rootPath.contains(additional)){
//            int i = this.rootPath.lastIndexOf(additional);
//            this.rootPath = this.rootPath.substring(0,i-1);
//        } else {
//            this.rootPath = rootPath + "/" + additional;
//        }
//        return rootPath;
//    }

    private String updateLink(String link) {
        makeShortLink(link);
        String result = "";
//        if (rootPath.contains(link)) {
//            result = rootPath.substring(rootPath.length(),rootPath.indexOf(link) + link.length());
//        } else {
//            result = rootPath.concat("/" + link);
//        }
        result = rootPath + shortPath;
        return result;
    }

    private String makeShortLink(String shortLink) {
        StringBuilder resultLink = new StringBuilder("");
        if (shortPath.toString().contains(shortLink)) {
            resultLink.append(shortPath.substring(0, shortPath.indexOf(shortLink) + shortLink.length()));
        } else {
            if (!shortLink.equals("")) {
                resultLink.append(shortPath.append("/").append(shortLink));
            } resultLink.reverse();
        }
        return resultLink.toString();
    }
}

















