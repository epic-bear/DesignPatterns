package app.patterns.creational.abstractFactory.bankingAppTeam;

import app.patterns.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {

  @Override
  public void manageCode() {
    System.out.println("Banking PM manages banking project...");
  }
}
