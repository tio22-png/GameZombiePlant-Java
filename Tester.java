public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        System.out.println("--- STATUS AWAL ---");
        System.out.println("Walking Zombie Data =\n" + wz.getZombieInfo());
        System.out.println("\nJumping Zombie Data =\n" + jz.getZombieInfo());
        System.out.println("\nBarrier Strength = " + b.getStrength());
        System.out.println("--- PERTARUNGAN DIMULAI! ---\n");

        int attackCount = 1;
        while (wz.getHealth() > 0 && jz.getHealth() > 0 && b.getStrength() > 0) {
            System.out.println("--- Serangan ke-" + attackCount + " ---");

            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);

            System.out.println("Walking Zombie Health: " + wz.getHealth());
            System.out.println("Jumping Zombie Health: " + jz.getHealth());
            System.out.println("Barrier Strength: " + b.getStrength());
            System.out.println();

            attackCount++;
        }

        System.out.println("--- PERTARUNGAN SELESAI ---");
        System.out.println("\nWalking Zombie Data =\n" + wz.getZombieInfo());
        System.out.println("\nJumping Zombie Data =\n" + jz.getZombieInfo());
        System.out.println("\nBarrier Strength = " + b.getStrength());
    }
}