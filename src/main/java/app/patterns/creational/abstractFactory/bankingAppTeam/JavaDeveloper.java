package app.patterns.creational.abstractFactory.bankingAppTeam;

import app.patterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {

  @Override
  public void writeCode() {
    System.out.println("Java developer writes code...");
  }
}
