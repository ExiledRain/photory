//package io.exiled.salesbook.service;
//
//import io.exiled.salesbook.model.Img;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service("photory")
//public class PhotoryService {
//    private List<String> paths = new ArrayList<>();
//    private List<Img> alps = new ArrayList<>();
//
//    @Value("${photory.path}")
//    private String rootPath;
//
//    private String path = "./upd";
//    //    private String path = "./src/main/resources/static/img/TallinnTrophy";
//    private int num = "./src/main/resources/static/".length();
//
//    public void buildPaths() {
////        try {
////            Files.list(Paths.get(path))
////                    .filter(Files::isDirectory)
////                    .forEach(f -> paths.add(f.toString()));
////        } catch (Exception e) {
////            System.err.println("Error in get paths");
////            e.printStackTrace();
////        }
//        paths.add("Alpha");
//        paths.add("Betta");
//        paths.add("Delta");
//    }
//
//
//    public List<String> getLinks() {
//        return paths;
//    }
//
//    public void makeCollection() {
//        for (String x : paths) {
//            if (x.endsWith(".jpg") || x.endsWith(".jpeg")) {
////                String path = x.substring(num);
//                if (x.startsWith("./upd")) {
//                    x = x.substring(5);
//                }
//                String xpath = x;
//                String name = x;
////                if (x.endsWith(".jpg")) {
////                    name = x.substring(x.length() - 8, x.length() - 4);
////                } else {
////                    name = x.substring(x.length() - 9, x.length() - 5);
////                }
//                alps.add(new Img(xpath, name));
//            }
//        }
//    }
//}
