package app.patterns.behavioral.observer;

public class ObserverMain {

  public static void main(String[] args) {

    JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
    jobSite.addVacancy("First");
    jobSite.addVacancy("Second");

    Observer observer1 = new Subscriber("Bob");
    Observer observer2 = new Subscriber("Rick");

    jobSite.addObserver(observer1);
    jobSite.addObserver(observer2);

    jobSite.addVacancy("Third");

    jobSite.removeVacancy("First");

  }
}
