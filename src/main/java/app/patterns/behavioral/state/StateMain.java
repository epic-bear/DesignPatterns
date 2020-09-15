package app.patterns.behavioral.state;

public class StateMain {

  public static void main(String[] args) {

    Activity activity = new Sleeping();

    Developer developer = new Developer();
    developer.setActivity(activity);

    for (int i = 0; i < 4; i++) {
      developer.justDoIt();
      developer.changeActivity();
    }
  }
}
