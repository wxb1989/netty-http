package com.cxz.server;

import com.sun.deploy.appcontext.AppContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author wangxuebin
 */
@SpringBootApplication
public class NettyServerApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(NettyServerApplication.class,args);


    }
}
