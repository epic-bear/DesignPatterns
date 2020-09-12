package app.patterns.structural.bridge;

class BridgeMain {

  public static void main(String[] args) {

    Program program = new BankSystem(new JavaDeveloper());

    program.developProgram();
  }
}
