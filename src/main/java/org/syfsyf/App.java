package org.syfsyf;

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
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        cacheService.hallo();
        cacheService.hallo();
        cacheService.hallo();
        cacheService.hallo();
        cacheService.hallo();
        cacheService.hallo();
        cacheService.hallo();
    }
}