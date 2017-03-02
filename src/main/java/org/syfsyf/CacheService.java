package org.syfsyf;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by mb on 2017-03-01.
 */
@Service
public class CacheService {

    @Cacheable("mycache")
    public String hallo(){
        System.out.println("hallo was called this:"+this);
        return "hallo"+cacheHello();
    }
    @Cacheable
    public String cacheHello(){
        System.out.println("cacheHello was called:" + this);
        return "hallo!!!!";
    }


    private final Logger LOG= LoggerFactory.getLogger(CacheService.class);

    @Cacheable("colors")
    public PhongMaterial create(Color diffuseColor, Color specularColor){

        LOG.info("create material: "+diffuseColor+","+specularColor);

        PhongMaterial material=new PhongMaterial();
        material.setDiffuseColor(diffuseColor);
        material.setSpecularColor(specularColor);

        return material;


    }

}
