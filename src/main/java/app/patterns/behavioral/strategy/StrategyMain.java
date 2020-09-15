package app.patterns.behavioral.strategy;

public class StrategyMain {

  public static void main(String[] args) {
    Developer developer = new Developer();

    developer.setActivity(new Training());
    developer.executeActivity();

    developer.setActivity(new Coding());
    developer.executeActivity();

    developer.setActivity(new Reading());
    developer.executeActivity();

    developer.setActivity(new Sleeping());
    developer.executeActivity();
  }
}
