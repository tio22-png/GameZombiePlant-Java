public class Plant {
    public void doDestroy(Zombie z) {
        z.destroyed();
    }

    public void doDestroy(Barrier b) {
        b.destroyed();
    }
}