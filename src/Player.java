public class Player {

    private boolean hasID;
    private boolean hasCleats;
    private boolean hasTalkedToCoach ;
    private boolean hasCode;

    public Player () {
        hasID = false;
        hasCleats = false;
        hasTalkedToCoach = false;
        hasCode = false;
    }

    public void look() {
        System.out.println("You are standing on Rooney Field. You see: ");
        System.out.println("- A coach standing alongside the field");
    }

//    this will help the player talk to coach
    public void talkCoach() {
        if (hasID && !hasTalkedToCoach) {
            hasTalkedToCoach = true;
            hasCode = true;
            System.out.println("Coach: I see you have your ID. Welcome to the team!");
            System.out.println("Coach: You have to get cleats, wait for me to give you the code.");
            System.out.println("Coach: Good luck out there!");
        } else if (!hasID) {
            System.out.println("Coach: Sorry, you have to get an ID to play here.");
        }
        else {
            System.out.println("Coach: Go get your cleats, the combination code is 10-10-25");
        }
    }

//    Getters and setters methods
    public boolean hasID() {
        return hasID;
    }

    public void setHasID(boolean hasID) {
        this.hasID = hasID;
    }

    public boolean hasCleats() {
        return hasCleats;
    }

    public void setHasCleats(boolean hasCleats) {
        this.hasCleats = hasCleats;
    }

    public boolean hasTalkedCoach() {
        return hasTalkedToCoach;
    }

    public boolean hasCode() {
        return hasCode;
    }


}
