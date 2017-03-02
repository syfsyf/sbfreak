package org.syfsyf;

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

}
