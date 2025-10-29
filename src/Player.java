public class Player {

    private boolean hasID;
    private boolean hasCleats;
    private boolean hasTalkedToCoach ;
    private boolean isLocked;

    public Player () {
        hasID = false;
        hasCleats = false;
        hasTalkedToCoach = false;
        isLocked = false;
    }

    public String look() {
        return "In front of you there is a field, the coach, a bench with towel, and a locker room";
    }

    public String liftTowel() {
        return "The towel has been lifted. You can pick your ID!";
    }

    public void takeID () {
        if (hasID) {
            System.out.println("You already have ID. Go talk to the coach");
        }
    }

    public boolean talkToCoach() {
        if (!hasID) {
            System.out.println("Get the code to unlock the locker");
        }

        return false;
    }

    public void openLocker() {
        if (isLocked) {
            System.out.println("The locker is closed, provide the code to unlock");
        }

    }

    public void takeCleats() {
        hasCleats = true;
        System.out.println("You got cleats, head back to the coach");
    }

    public String toString() {
        return "";
    }
}
