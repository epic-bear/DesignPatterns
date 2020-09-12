package app.patterns.creational.abstractFactory.websiteTeam;

import app.patterns.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {

  @Override
  public void writeCode() {
    System.out.println("Php developer writes code...");
  }
}
