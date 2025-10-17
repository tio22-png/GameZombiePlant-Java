public abstract class Zombie {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public int getHealth() {
        return this.health;
    }

    public abstract void heal();

    public String getZombieInfo() {
        return "Health = " + this.health + "\n" + "Level = " + this.level;
    }

    public abstract void destroyed();
}