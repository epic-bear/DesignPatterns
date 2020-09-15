package app.patterns.behavioral.template;

public class TemplateMain {

  public static void main(String[] args) {

    WebSiteTemplate welcome = new WelcomePage();
    WebSiteTemplate news = new NewsPage();

    welcome.showPage();
    System.out.println("\n======================\n");
    news.showPage();
  }
}
