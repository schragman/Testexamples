package net.schrage.mytests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class T3BeanTest {

  @SpyBean
  private Bean1 bean1;

  @Test
  void testAusgabeBean1() {
    System.out.println(bean1.ausgabe());
  }

  @Test
  void testMitMock() {
    Mockito.when(bean1.ausgabe()).thenReturn("Ausgabe mit Mockito :)))");
    System.out.println(bean1.ausgabe());
  }

}
