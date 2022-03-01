package cloud.minghan.metahouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"cloud.minghan.matahouse"})
public class MetaHouseApplication {
    public static void main(String[] args) {
        SpringApplication.run(MetaHouseApplication.class, args);
    }
}