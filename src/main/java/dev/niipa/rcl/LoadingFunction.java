package dev.niipa.rcl;

@FunctionalInterface
public interface LoadingFunction<T> {
  T load();
}
