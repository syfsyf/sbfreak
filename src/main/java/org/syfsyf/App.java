package org.syfsyf;


import javafx.scene.paint.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;



@SpringBootApplication
@EnableCaching
public class App implements CommandLineRunner{
    @Autowired
    CacheService cacheService;

    @Autowired
    MyComponent myComponent;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {


        cacheService.create(Color.WHITE,Color.YELLOW);
        cacheService.create(Color.WHITE,Color.YELLOW);
    }
}