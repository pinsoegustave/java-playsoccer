import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command;

//        Initialize game objects
        Player player = new Player();
        Bench bench = new Bench();
        Locker locker = new Locker();
        Ball ball = new Ball();

//        Print the welcome message
        System.out.println("=== Welcome to Cristiano's Soccer Play ===");
        System.out.println("Cristiano is new to Pittsburgh and wants to play soccer at Rooney Field.");
        System.out.println("Help him follow the rules to join the game and score a goal!");
        System.out.println("==============================================");

        boolean gameRunning = true;
        boolean winGame = false;

//        Main game loop
        while (gameRunning && !winGame) {
//            Prompt the user to enter command
            System.out.println("\nPlease enter a command here: ");
            command = input.nextLine();

            if (command.equals("quit")) {
                gameRunning = false;
                System.out.println("*****");
            } else if (command.equals("look")) {
                player.look();
                bench.look();
                locker.look();
                ball.look();
            } else if (command.equals("examine bench")) {
                bench.examine();
            } else if (command.equals("examine locker")) {
                locker.examine();
            } else if (command.equals("examine ball")) {
                ball.examine();
            } else if (command.equals("examine coach")) {
                System.out.println("The coach is wearing a red t-shirt with a whistle in the neck.");
            } else if (command.equals("lift towel")) {
                bench.liftTowel();
            } else if (command.equals("take id")) {
                bench.takeID();
                if (bench.isIDTaken()) {
                    player.setHasID(true);
                }
            } else if (command.equals("talk to coach")) {
                player.talkCoach();
            } else if (command.equals("unlock locker")) {
                locker.unlock();
            } else if (command.equals("open locker")) {
                locker.openLocker();
            } else if (command.equals("take cleats")) {
                locker.takeCleats();
                if (!locker.hasCleats()) {
                    player.setHasCleats(true);
                }
            } else if (command.equals("inflate ball")) {
                ball.inflate(player);
            } else if (command.equals("kick ball")) {
                ball.kick();
                if (ball.isKicked()) {
                    winGame = true;
                }
            }
            else {
                System.out.println("Invalid command. Try again!!");
            }
            // end of main if-clause
        }

//        Ending message
        if (winGame) {
            System.out.println("\n========================================");
            System.out.println("CONGRATULATIONS! You helped Cristiano score a goal!");
            System.out.println("Thanks for playing!!");
            System.out.println("========================================");
        }

        input.close();

    }
}
