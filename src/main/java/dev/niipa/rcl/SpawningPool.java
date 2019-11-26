package dev.niipa.rcl;

import java.util.HashMap;
import java.util.Map;

public class SpawningPool {
  private Map<Class<?>, EvolutionChamber<?>> registry = new HashMap<>();


  public <T> void register(Class<T> clazz, EvolutionChamber<T> evolutionChamber) {
    registry.put(clazz, evolutionChamber);
  }

  @SuppressWarnings("unchecked")
  public <T> T spawn(Class<T> clazz) {
    return (T) registry.get(clazz);
  }
}
