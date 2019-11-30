package dev.niipa.rcl;

import java.util.HashMap;
import java.util.Map;

public class SpawningPool {
  private Map<Class<? extends Evolvable>, EvolutionChamber<? extends Evolvable>> registry = new HashMap<>();


  public <T extends Evolvable> void register(Class<T> clazz, EvolutionChamber<T> evolutionChamber) {
    registry.put(clazz, evolutionChamber);
  }

  @SuppressWarnings("unchecked")
  public <T extends Evolvable> T spawn(Class<T> clazz) {
    EvolutionChamber<T> evolutionChamber = (EvolutionChamber<T>) registry.get(clazz);
    
    return (T) registry.get(clazz);
  }
}
