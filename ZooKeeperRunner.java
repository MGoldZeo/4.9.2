/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  {
    Elephant elly = new Elephant("leaves, grasses, roots", false, 60.0);
    elly.trumpet();
    elly.eat();
    elly.isNocturnal();
    elly.getLifeSpan();
    Tiger tigger = new Tiger("meat", true, 17.0);
    tigger.swim();
    tigger.huntAlone();
    tigger.eat();
    tigger.getLifeSpan();
    tigger.isNocturnal();
    tigger.growl();
    tigger.roar();
    Tiger tig = new Tiger();
    Elephant el = new Elephant();
    Giraffe gina = new Giraffe("leaves", false, 25.0);
    gina.eat();
    Hippo helga = new Hippo();
    helga.eat();
    Penguin pingu = new Penguin();
    pingu.fish();
    Owl oliver = new Owl();
    oliver.hunt();
    Owl olivia = new Owl("mice,insects", true, 4.0);
    olivia.eat();
  }
}