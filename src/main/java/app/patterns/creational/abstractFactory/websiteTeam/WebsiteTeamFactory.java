package app.patterns.creational.abstractFactory.websiteTeam;

import app.patterns.creational.abstractFactory.Developer;
import app.patterns.creational.abstractFactory.ProjectManager;
import app.patterns.creational.abstractFactory.TeamFactory;
import app.patterns.creational.abstractFactory.Tester;
import app.patterns.creational.abstractFactory.websiteTeam.ManualTester;
import app.patterns.creational.abstractFactory.websiteTeam.PhpDeveloper;
import app.patterns.creational.abstractFactory.websiteTeam.WebsitePM;

public class WebsiteTeamFactory implements TeamFactory {

  @Override
  public Developer getDeveloper() {
    return new PhpDeveloper();
  }

  @Override
  public Tester getTester() {
    return new ManualTester();
  }

  @Override
  public ProjectManager getProjectManager() {
    return new WebsitePM();
  }
}
