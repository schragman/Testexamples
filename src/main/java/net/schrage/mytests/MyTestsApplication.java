package net.schrage.mytests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyTestsApplication {

  public static void main(String[] args) {
    SpringApplication.run(MyTestsApplication.class, args);
  }

  @Bean
  public Bean1 getBean1() {
    return new Bean1();
  }

  @Bean
  public Bean2 getBean2() {
    return new Bean2();
  }

  @Bean
  public Bean3 getBean3() {
    return new Bean3();
  }

}
