package dev.niipa.rcl;

/**
 * An evolution chamber based on some ti
 * @param <T>
 */
public abstract class EvolutionChamber<T extends Evolvable> extends ClassLoader implements LoadingFunction {
  abstract Class<T> evolve();
}
