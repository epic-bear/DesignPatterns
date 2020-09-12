package app.patterns.creational.abstractFactory;

public interface TeamFactory {

  Developer getDeveloper();

  Tester getTester();

  ProjectManager getProjectManager();

}
