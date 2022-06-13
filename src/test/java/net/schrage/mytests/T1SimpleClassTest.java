package net.schrage.mytests;

import org.junit.jupiter.api.Test;

class T1SimpleClassTest {

  @Test
  void TestAusgabe() {
    SimpleClass simpleClass = new SimpleClass();
    System.out.println(simpleClass.ausgabe());
    //Assertions
  }
}