package Composite;

import Strategies.Strategy;

public class Et {
  private final Strategy[] strategies;

  public Et(Strategy... strategies) {
    this.strategies = strategies;
  }

  public boolean execute(String mot) {
    for (Strategy strategy : strategies) {
      if (!strategy.estValide(mot)) {
        return false;
      }
    }
    return true;
  }

}
