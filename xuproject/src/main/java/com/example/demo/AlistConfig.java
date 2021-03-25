package com.example.demo;

import java.util.List;
import lombok.Data;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

/**
 * Demo class
 *
 * @author xuxuhui
 * @date 2021/03/24
 */
@Component
//@PropertySource(value = "classpath:a.yaml")
@ConfigurationProperties(prefix = "alist", ignoreInvalidFields = false)
@Configuration
@Data
public class AlistConfig {

  @Bean
  public static PropertySourcesPlaceholderConfigurer properties() {
    PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
    YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
    yaml.setResources(new ClassPathResource("a.yaml"));
    configurer.setProperties(yaml.getObject());
    return configurer;
  }


  private List<AlistItem> list;

}

@Data
@Configuration
@Component
 class AlistItem {
  private String name;
  private int age;

}