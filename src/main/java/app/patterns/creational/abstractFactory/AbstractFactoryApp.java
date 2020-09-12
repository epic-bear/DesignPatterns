package app.patterns.creational.abstractFactory;

import app.patterns.creational.abstractFactory.bankingAppTeam.BankingTeamFactory;
import app.patterns.creational.abstractFactory.websiteTeam.WebsiteTeamFactory;

public class AbstractFactoryApp {

  public static void main(String[] args) {
    TeamFactory teamFactory = new WebsiteTeamFactory();

    Developer developer = teamFactory.getDeveloper();
    Tester tester = teamFactory.getTester();
    ProjectManager projectManager = teamFactory.getProjectManager();

    developer.writeCode();
    tester.testCode();
    projectManager.manageCode();
  }
}
