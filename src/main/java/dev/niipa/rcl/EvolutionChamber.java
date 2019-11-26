package dev.niipa.rcl;

public abstract class EvolutionChamber<T> extends ClassLoader implements LoadingFunction {
  abstract Class<T> evolve();
}
