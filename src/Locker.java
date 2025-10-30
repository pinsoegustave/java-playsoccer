public class Locker {
//    Instance variables
    private boolean open;
    private boolean hasCleats;
    private boolean isLocked;

    public Locker() {
        open = false;
        hasCleats = false;
        isLocked = true;
    }

//    this will show the player inside the locker room
    public void look() {
        System.out.println("- A locker with a combinational lockscreen.");
    }

//    this will provide details about the locker
    public void examine() {
        if (isLocked) {
            System.out.println("A metal locker secured with a combinational lock. It appears to be locked.");
        } else if (open) {
            if (!hasCleats) {
                System.out.println("The locker is open! Inside you see a pair of soccer cleats.");
            }
            else {
                System.out.println("The locker is open and empty.");
            }
        }
        else {
            System.out.println("The locker is unlocked but still closed.");
        }
    }

    public String unlock() {
        return "interact with combinational lock";
    }

//    this will help the player to open the locker to see cleats
    public void openLocker() {
        if (!isLocked && !open) {
            open = true;
            System.out.println("You open the locker door.");
        } else if (isLocked) {
            System.out.println("The locker is locked. You need to unlock it first.");
        }
        else {
            System.out.println("The locker is already open.");
        }
    }

//    this will help the player take the cleats from the locker
    public void takeCleats() {
        if (open && hasCleats) {
            hasCleats = false;
            System.out.println("You can take the cleats from the locker!");
        }
        else if (!open) {
            System.out.println("You need to open the locker first.");
        }
        else {
            System.out.println("There are no cleats left in the locker.");
        }
    }

//    Getters methods
    public boolean isOpen() {
        return open;
    }

    public boolean hasCleats() {
        return hasCleats;
    }

    public boolean isLocked() {
        return isLocked;
    }
}
