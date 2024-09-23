package Composite;

import Strategies.Strategy;

public class Not {
  private final Strategy strategy;

  public Not(Strategy strategy) {
    this.strategy = strategy;
  }

  public boolean execute(String mot) {
    return !strategy.estValide(mot);
  }

}
