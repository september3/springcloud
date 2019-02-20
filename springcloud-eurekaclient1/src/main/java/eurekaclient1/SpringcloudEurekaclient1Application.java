package eurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient  //激活Eureka中的DiscoveryClient实现，才能实现Controller中对服务信息的输出
@SpringBootApplication
public class SpringcloudEurekaclient1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaclient1Application.class, args);
    }

}
