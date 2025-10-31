public class Ball {
//    Instance variables
    private boolean isInflated;
    private boolean isKicked;

    public Ball () {
        isInflated = false;
        isKicked = false;
    }

//    method that shows the player around the field after coming from the locker room
    public void look() {
        System.out.println("- A soccer ball on the field.");
    }

//    method provides details on how to use the ball
    public void examine() {
        if (!isInflated) {
            System.out.println("The ball is deflated, you need to inflate before kicking it");
        } else if (!isKicked) {
            System.out.println("A soccer ball is ready to be kicked now!");
        }
        else {
            System.out.println("You kicked the ball to the net! GOAL!");
        }
    }

//    method to help the player inflate the ball,
    public void inflate(Player player) {
        if (!player.hasCleats()) {
            System.out.println("You can't inflate the ball without cleats. Go find them first");
        }
        else if (!isInflated) {
            isInflated = true;
            System.out.println("You have inflated the ball. Now you can kick it.");
        }
        else {
            System.out.println("The ball is already inflated.");
        }
    }

//    method to help the player kick the ball, score and win the game!!
    public void kick() {
        if (isInflated && !isKicked) {
            isKicked = true;
            System.out.println("You kicked the ball, you won!!!");
        } else if (!isInflated) {
            System.out.println("The ball is deflated. You need to inflate it first.");
        } else {
            System.out.println("You've already scored the goal");
        }
    }

//    Getters
    public boolean isInflated() {
        return isInflated;
    }

    public boolean isKicked() {
        return isKicked;
    }

}
