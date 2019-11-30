package dev.niipa.rcl;

/**
 * Spawns new versions of classes.
 */
public class Hatchery {

  private SpawningPool spawningPool;
  private EvolutionChamber evolutionChamber;

  public Hatchery(SpawningPool spawningPool) {
    this.spawningPool = spawningPool;
  }

  public <T extends Evolvable> T spawn(Class<T> clazz) {
    return spawningPool.spawn(clazz);
  }
}
