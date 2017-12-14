package jp.co.biglobe.isp;

import jp.co.biglobe.isp.properties.ServiceProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    ServiceProperties.class
})
public class BootApplication {

    public static void main(String args[]) {
        SpringApplication.run(BootApplication.class, args);
    }
}
