package cn.toj.apollodemo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class ApollodemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApollodemoApplication.class, args);
    }

}
