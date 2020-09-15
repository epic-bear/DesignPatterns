package app.patterns.behavioral.mediator;

public class ChatRunner {

  public static void main(String[] args) {
    SimpleTextChat chat = new SimpleTextChat();

    User admin = new SimpleUser(chat,"Admin");
    User user1 = new SimpleUser(chat,"User1");
    User user2 = new SimpleUser(chat,"User2");
    User user3 = new SimpleUser(chat,"User3");
    User user4 = new SimpleUser(chat,"User4");

    chat.setAdmin(admin);
    chat.addUserToChat(user1);
    chat.addUserToChat(user2);
    chat.addUserToChat(user3);
    chat.addUserToChat(user4);

    admin.sendMessage("Hello! I'm user1.");
  }
}
