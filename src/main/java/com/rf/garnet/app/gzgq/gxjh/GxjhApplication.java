package com.rf.garnet.app.gzgq.gxjh;

import com.rf.garnet.sdk.jedis.annotation.EnableRedis;
import com.rf.garnet.sdk.poi.annotation.EnablePoi;
import com.rf.garnet.springboot.bootup.Bootup;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class GxjhApplication extends Bootup {

    public static void main(String[] args) {
        try {
            new GxjhApplication().start(args);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
