package Strategies;

public class Palindrome implements Strategy {
  @Override
  public boolean estValide(String mot) {
    return mot.contentEquals(new StringBuilder(mot).reverse());
  }
}
