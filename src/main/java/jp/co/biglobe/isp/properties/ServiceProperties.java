package jp.co.biglobe.isp.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "biglobe")
public class ServiceProperties {
    public String bucketName = "";
}
