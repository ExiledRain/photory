package io.exiled.salesbook.service;

import io.exiled.salesbook.model.Img;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

@Service("test")
public class TestService {
    private String text = "This is alpha text";

    public void test() {
        try (PrintWriter out = new PrintWriter("filename.txt")) {
            out.println(text);
        } catch (FileNotFoundException e) {
            System.err.println("Something went wrong: " + e.getMessage());
        }
    }

    public void test(List<Img> coll) {
        try (PrintWriter out = new PrintWriter("coll.txt")) {
            for (Img oni :
                    coll) {
                out.println(oni.getName());
            }
            out.println(" this works");
        } catch (FileNotFoundException e) {
            System.err.println("Something went wrong: " + e.getMessage());
        }
    }
}
