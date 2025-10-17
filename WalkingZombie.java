public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                this.health += (int) (this.health * 0.20);
                break;
            case 2:
                this.health += (int) (this.health * 0.30);
                break;
            case 3:
                this.health += (int) (this.health * 0.40);
                break;
        }
    }

    @Override
    public void destroyed() {
        this.health -= (int) (this.health * 0.20);
        if (this.health <= 0) {
            this.health = 0;
            System.out.println("Walking Zombie telah kalah!");
        }
    }
}