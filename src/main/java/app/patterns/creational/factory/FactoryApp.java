package app.patterns.creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FactoryApp {

  public static void main(String[] args) throws IOException {
    DeveloperFactory factory = new DeveloperFactory();
    System.out.println("Enter cpp or java.");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Developer developer = factory.createDeveloper(reader.readLine());

    developer.writeCode();
  }

}
