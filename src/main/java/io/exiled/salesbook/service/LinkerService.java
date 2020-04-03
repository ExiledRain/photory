//package io.exiled.salesbook.service;
//
//import io.exiled.salesbook.model.Linker;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service("linker")
//public class LinkerService {
//
//    @Autowired
//    private PhotoryService service;
//
//    @Value("${photory.path}")
//    private String rootPath;
//
//
//
//    public List<Linker> getFolders(String root) {
//        List<Linker> folders = new ArrayList<>();
//
////        try {
////            Files.list(Paths.get(root))
////                    .filter(Files::isDirectory)
////                    .forEach(f -> folders.add(f.toString().substring(root.length() + 1)));
////        } catch (Exception e) {
////            System.err.println("Error in get paths");
////            e.printStackTrace();
////        }
//
//        try {
//            Files.list(Paths.get(root))
//                    .filter(Files::isDirectory)
//                    .forEach(f -> folders.add(new Linker(updateLink(root),root)));
//        } catch (Exception e) {
//            System.err.println("Error in get paths");
//            e.printStackTrace();
//        }
//
//        return folders;
//    }
//
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
//
////    public String updateLink(String additional) {
////        int len = this.rootPath.length();
////        if(this.rootPath.contains(additional)){
////            int i = this.rootPath.lastIndexOf(additional);
////            this.rootPath = this.rootPath.substring(0,i-1);
////        } else {
////            this.rootPath = rootPath + "/" + additional;
////        }
////        return rootPath;
////    }
//
//    private String updateLink(String link) {
//        String result = "";
//        if (rootPath.contains(link)) {
//            result = rootPath.substring(0,rootPath.indexOf(link) + link.length());
//        } else {
//            result = rootPath.concat("/" + link);
//        }
//        return result;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
