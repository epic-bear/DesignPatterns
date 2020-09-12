package app.patterns.structural.composite;

public class CompositeMain {

  public static void main(String[] args) {
    Team team = new Team();

    Developer developer1 = new JavaDeveloper();
    Developer developer2 = new CppDeveloper();
    Developer developer3 = new JavaDeveloper();

    team.addDeveloper(developer1);
    team.addDeveloper(developer2);
    team.addDeveloper(developer3);

    team.createProject();
  }
}
