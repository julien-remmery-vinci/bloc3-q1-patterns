public class Main {

  public static void main(String[] args) {
    AbstractFactory livreFactory = new LivreFactory();
    Magasin magasinLivre = new Magasin(livreFactory);
    magasinLivre.ajouterArticle("Livre1", 2000);
    magasinLivre.ajouterArticle("Livre2", 2001);

    AbstractFactory dvdFactory = new DVDFactory();
    Magasin magasinDVD = new Magasin(dvdFactory);
    magasinDVD.ajouterArticle("DVD1", 2002);
    magasinDVD.ajouterArticle("DVD2", 2003);
  }

}
