import java.util.*;

public class ToyStore {
  private PriorityQueue<Toy> queue;

  public ToyStore() {
    queue = new PriorityQueue<>(Comparator.comparing(Toy::getChance).reversed());
  }

  public void addToy(Toy toy) {
    queue.add(toy);
  }

  public Toy getRandomToy() {
    double randomNumber = Math.random();

    for (Toy toy : queue) {
      if (randomNumber < toy.getChance()) {
        return toy;
      }
      randomNumber -= toy.getChance();
    }

    return null;
  }
}