public class Toy {
    private int id;
    private String name;
    private double chance;

    public Toy(int id, String name, double chance) {
      this.id = id;
      this.name = name;
      this.chance = chance;
    }

    public int getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public double getChance() {
      return chance;
    }

    public void setChance(double chance) {
      this.chance = chance;
    }
  }