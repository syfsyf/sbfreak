package org.syfsyf;

import javafx.scene.paint.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by mb on 2017-03-06.
 */
@Component
public class MyComponent {

    @Autowired
    CacheService cacheService;

    private final Logger LOG= LoggerFactory.getLogger(MyComponent.class);


    @PostConstruct
    private void init(){
        LOG.info("cache1");
        cacheService.create(Color.WHITE,Color.RED);
        LOG.info("cache2");
        cacheService.create(Color.WHITE,Color.RED);
    }
}
