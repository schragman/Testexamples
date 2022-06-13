package net.schrage.mytests;

import org.springframework.beans.factory.annotation.Autowired;

public class Bean2 {

  @Autowired
  private Bean3 bean3;

  public String ausgabe() {
    return "Das ist die Ausgabe von Bean2 + " + bean3.ausgabe();
  }


}
