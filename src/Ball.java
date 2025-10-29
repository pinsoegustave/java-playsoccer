public class Ball {
//    Instance variables
    private boolean isInflate;
    private boolean isKicked;

    public Ball () {
        isInflate = false;
        isKicked = false;
    }

    public boolean inflate() {
        if (isInflate) {
            isInflate = true;
            System.out.println("The ball has air now");
        }

        return false;
    }

    public boolean kick() {
        System.out.println("You kicked the ball, you won!!!");
        return isKicked = true;
    }
}
