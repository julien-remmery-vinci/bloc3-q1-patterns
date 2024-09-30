public class Main {

  public static void main(String[] args) {
    Magasin magasinDeDVD = new MagasinDeDVD();
    magasinDeDVD.ajouterArticle("DVD1", 2000);
    magasinDeDVD.ajouterArticle("DVD2", 2001);

    Magasin magasinDeLivre = new MagasinDeLivre();
    magasinDeLivre.ajouterArticle("Livre1", 2002);
    magasinDeLivre.ajouterArticle("Livre2", 2003);
  }

}
