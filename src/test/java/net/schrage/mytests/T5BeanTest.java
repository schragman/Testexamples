package net.schrage.mytests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

@SpringBootTest
public class T5BeanTest {

  @SpyBean
  private Bean2 bean2;

  @Test
  void testAusgabeBean2() {
    System.out.println(bean2.ausgabe());
  }

}


