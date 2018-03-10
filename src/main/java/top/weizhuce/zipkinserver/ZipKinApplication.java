package top.weizhuce.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import zipkin.server.EnableZipkinServer;

/**
 * Created by zseapeng on 2018/03/10
 */
@SpringCloudApplication
@EnableZipkinServer
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class,args);
    }
}
