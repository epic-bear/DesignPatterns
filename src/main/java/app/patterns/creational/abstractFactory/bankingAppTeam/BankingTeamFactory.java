package app.patterns.creational.abstractFactory.bankingAppTeam;

import app.patterns.creational.abstractFactory.Developer;
import app.patterns.creational.abstractFactory.ProjectManager;
import app.patterns.creational.abstractFactory.TeamFactory;
import app.patterns.creational.abstractFactory.Tester;

public class BankingTeamFactory implements TeamFactory {

  @Override
  public Developer getDeveloper() {
    return new JavaDeveloper();
  }

  @Override
  public Tester getTester() {
    return new QATester();
  }

  @Override
  public ProjectManager getProjectManager() {
    return new BankingPM();
  }
}
