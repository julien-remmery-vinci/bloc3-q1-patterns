package Composite;

import Strategies.Strategy;

public class Or {
  private final Strategy strategy1;
  private final Strategy strategy2;

  public Or(Strategy strategy1, Strategy strategy2) {
    this.strategy1 = strategy1;
    this.strategy2 = strategy2;
  }

  public boolean execute(String mot) {
    return strategy1.estValide(mot) || strategy2.estValide(mot);
  }

}
