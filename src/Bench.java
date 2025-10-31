// Bench class: This class will help interact with the bench and towel
// to help the player get the ID

public class Bench {

//    Instance variables
    private boolean isIDTaken;
    private boolean isLifted;

    public Bench() {
        isLifted = false;
        isIDTaken = false;
    }

//    method that shows the bench
    public void look() {
        System.out.println("- A bench with a towel on it.");
    }

//    method will provide details about the bench
    public void examine() {
        System.out.println("A bench with a towel placed above it.");
        if (!isLifted) {
            System.out.println("The towel looks like it might be hiding something...");
        } else if (!isIDTaken) {
            System.out.println("There is a card visible under the lifted towel");
        }
        else {
            System.out.println("The bench is empty now.");
        }

    }
//    method to help the player lift the towel to take the ID
    public void liftTowel() {
        if (!isLifted) {
            isLifted = true;
            System.out.println("You have lifted the towel, and you see the ID card there!");
        }
        else {
            System.out.println("The towel is already lifted.");
        }
    }

//    method to take the ID from the towel
    public void takeID() {
        if (isLifted && !isIDTaken) {
            isIDTaken = true;
            System.out.println("You've got the ID now, go talk to the coach!");
        } else if (!isLifted) {
            System.out.println("You need to lift the towel first!");
        }
        else {
            System.out.println("You already have the ID.");
        }
    }

//    Getters methods
    public boolean isIDTaken() {
        return isIDTaken;
    }

    public boolean isLifted() {
        return isLifted;
    }
 }
