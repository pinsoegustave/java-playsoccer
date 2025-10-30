public class Locker {
//    Instance variables
    private boolean open;
    private boolean hasCleats;
    private boolean isLocked;
    private CombinationLock lock;

    public Locker() {
        open = false;
        hasCleats = true;
        isLocked = true;
        lock = new CombinationLock("10-10-25", "(format: ##-##-##)");
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

    public void unlock() {
        if (!isLocked) {
            System.out.println("The locker is already unlocked");
            return;
        }

        System.out.println("You try to unlock the locker...");
        boolean unlocked = lock.unlock();

        if (unlocked) {
            isLocked = false;
            System.out.println("Click! The locker is unlocked now, you can open the locker to take cleats!" );
        }
        else {
            System.out.println("Wrong code! The lock is still closed");
        }
    }

//    this will help the player to open the locker to see cleats
    public void openLocker() {
        if (!isLocked && !open) {
            open = true;
            System.out.println("You have opened the locker now, you can take cleats!!");
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
            System.out.println("You have the cleats now, head back to the field!");
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
