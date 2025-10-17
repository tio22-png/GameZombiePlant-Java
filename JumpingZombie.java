public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                this.health += (int) (this.health * 0.30);
                break;
            case 2:
                this.health += (int) (this.health * 0.40);
                break;
            case 3:
                this.health += (int) (this.health * 0.50);
                break;
        }
    }

    @Override
    public void destroyed() {
        this.health -= (int) (this.health * 0.10);
        if (this.health <= 0) {
            this.health = 0;
            System.out.println("Jumping Zombie telah kalah!");
        }
    }
}