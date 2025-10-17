public class Barrier {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    public void destroyed() {
        this.strength -= 9;
        if (this.strength <= 0) {
            this.strength = 0;
            System.out.println("Barrier telah hancur!");
        }
    }

    public String getBarrierInfo() {
        return "Barrier Strength: " + this.strength;
    }
}