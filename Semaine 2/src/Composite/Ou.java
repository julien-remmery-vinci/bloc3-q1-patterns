package Composite;

import Strategies.Strategy;

public class Ou {
  private final Strategy[] strategies;

  public Ou(Strategy... strategies) {
    this.strategies = strategies;
  }

  public boolean execute(String mot) {
    for (Strategy strategy : strategies) {
      if (strategy.estValide(mot)) {
        return true;
      }
    }
    return false;
  }

}
