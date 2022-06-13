package net.schrage.mytests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class T4BeanTest {

  @SpyBean
  private Bean2 bean2;


  @Test
  void testAusgabeBean2() {
    System.out.println(bean2.ausgabe());
  }

}

/*
JUnit 4
@RunWith(SpringRunner.class)
 */