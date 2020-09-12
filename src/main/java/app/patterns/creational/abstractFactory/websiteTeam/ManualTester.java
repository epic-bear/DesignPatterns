package app.patterns.creational.abstractFactory.websiteTeam;

import app.patterns.creational.abstractFactory.Tester;

public class ManualTester implements Tester {

  @Override
  public void testCode() {
    System.out.println("Manual tester tests code...");
  }
}
