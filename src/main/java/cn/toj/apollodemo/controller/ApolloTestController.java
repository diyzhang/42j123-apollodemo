package cn.toj.apollodemo.controller;

import cn.toj.apollodemo.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Carlos
 * @description
 * @Date 2020/8/24
 */

@RestController
public class ApolloTestController {

    @Value("${config-test}")
    private String config;

    @GetMapping("/getConfig")
    public ResponseResult<String> getConfig() {
        return new ResponseResult<>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), config);
    }

}
