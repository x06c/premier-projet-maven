package dev;

import com.github.lalyos.jfiglet.FigletFont;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        String asciiArt = null;
        try {
            asciiArt = FigletFont.convertOneLine("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(asciiArt);

        SpringApplication.run(App.class, args);


    }
}