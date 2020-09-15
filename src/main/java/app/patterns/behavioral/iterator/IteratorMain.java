package app.patterns.behavioral.iterator;

public class IteratorMain {

  public static void main(String[] args) {
    String[] skills = {"Java","Spring","Hibernate","Maven","MySQL"};

    JavaDeveloper developer = new JavaDeveloper("Bob",skills);

    Iterator iterator = developer.getIterator();

    System.out.println("Developer name: "+ developer.getName());
    System.out.print("Skills: ");
    while (iterator.hasNext()){
      System.out.print(iterator.next().toString()+" ");
    }
  }
}
