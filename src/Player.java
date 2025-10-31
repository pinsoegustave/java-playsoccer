import java.util.Random;

public class Player {

    private boolean hasID;
    private boolean hasCleats;
    private boolean hasTalkedToCoach ;
    private boolean hasCode;
    private String lockerCode;

    public Player () {
        hasID = false;
        hasCleats = false;
        hasTalkedToCoach = false;
        hasCode = false;
        lockerCode = "";
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

//            Generate random combination lockerCode
            Random r = new Random();
            int num1 = r.nextInt(10, 20);
            int num2 = r.nextInt(20,30);
            int num3 = r.nextInt(30,40);

            lockerCode = num1+"-"+ num2+"-"+num3;

            System.out.println("Coach: I see you have your ID. Welcome to the team!");
            System.out.println("Coach: You have to get cleats, use this code "+ lockerCode+" to unlock the locker, and take one.");
            System.out.println("Coach: Otherwise, Good luck out there!");
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

    public String getLockerCode() {
        return lockerCode;
    }

}
