public class Locker {
//    Instance variables
    private boolean open;
    private boolean hasCleats;
    private boolean unlocked;

    public Locker() {
        open = false;
        hasCleats = false;
        unlocked = false;
    }

    public void look() {
        System.out.println("You see a locker door with a locker screen");
    }

    public void examine() {
        System.out.println("The locker is closed, and says 'Provide code to open'");
    }

    public String unlock() {
        return "interact with combinational lock";
    }
}
