package net.schrage.mytests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


public class T2BeanTest {

  @Autowired
  private Bean1 bean1;

  @Test
  public void testAusgabeBean1() {
    System.out.println(bean1.ausgabe());
  }

}
