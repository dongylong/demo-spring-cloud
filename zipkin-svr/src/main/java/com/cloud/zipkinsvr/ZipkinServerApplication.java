package com.cloud.zipkinsvr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

import java.lang.invoke.MethodHandles;

/**
 * @author dongyl
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class, args);
    }

}