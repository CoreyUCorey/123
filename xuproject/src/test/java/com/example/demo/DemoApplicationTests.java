package com.example.demo;

import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableAutoConfiguration
class DemoApplicationTests {
  @Resource
  AlistConfig alistConfig;

  @Test
  void contextLoads() {
  }

  @Test
  public void test(){
    int i=0;
  }

}
