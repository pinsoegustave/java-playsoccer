## Play Soccer Game Project Design (Java)

Cristiano is new to Pittsburgh, and he wants to play soccer sometime. He walks near Rooney Field and sees some guys playing soccer, and wants to join them. However, playing with them isn’t that easy; there are some rules to follow to join the team. You will help Cristiano play and score a goal.

### Goal: Help Cristiano score a goal.

### Rules to play soccer and score a goal.
- You must first speak with the head coach. He is eligible to know if you have an ID.
- You must wear cleats. The head coach will help you get them.
- You will need to unlock the locker room with a combination lock: 10-10-25, given by the head coach, and take the cleats.
- After having cleats, you will inflate the ball on the field.
- Kick the ball and score a goal.


### Pathway to winning:
1. Lift the towel: You will first need an ID to play, and the ID is hidden inside the towel. You just lift the towel.
2. Take ID: You will take the ID after lifting the towel.
3. Talk to coach: You must have an ID to talk to the coach.
4. Generate code: The coach will generate the random code to unlock the locker and take the cleats. 
5. Unlock locker: You will have to unlock the locker room with the code given by the coach to take your cleats.
6. Inflate the ball: There is a ball on the field, and you have to inflate it before kicking it. You have to kick it after to score a goal (Cristiano scores, the game ends).
7. Kick the ball: You will kick the ball at the end, then score a goal, and the game ends!!



## Classes
### Bench Class
Attributes:
- isIDTaken: boolean to return true when the player takes the ID.
- isLifted: boolean to return true when the player lifts the towel.

Methods:
- look(): method to show the bench and towel.
- examine(): this method provides details about the bench and the towel. 
- liftTowel(): this method will help the player lift the towel.
- takeID(): This method will help the player take the ID from the towel.


### Player Class
Attributes:
- Boolean hasID: This will return TRUE if the player has taken the ID.
- Boolean hasCleats: This will return TRUE if the player has taken the cleats.
- Boolean hasTalkedToCoach: This will return TRUE if the player has talked to the coach.
- Boolean hasCode: This will return TRUE if the player has obtained the code.
- String lockerCode: This variable holds the generated code for the coach

Methods:
- look(): This will be called when the player is looking around the field. It will say that the player is seeing the coach, the bench, and the locker.
- talkCoach(): This method will make the player talk to coach and get more rules.


### Ball Class
Attributes:
- Boolean isInflated: This will return TRUE if the player inflated the ball.
- Boolean isKicked: This will return TRUE when the player kicks the ball, and this decides that the player has won the game.

Methods:
- look(): This method shows the player around the field.
- examine(): This method provides details on how to use the ball.
- inflate(): This method helps the player inflate the ball.
- kick(): This method helps the player kick the ball.


### Locker Class
Attributes: 
- Boolean open: This will return true if the locker has been opened.
- Boolean hasCleats: This will return true if the player has picked the cleats.
- Boolean isLocked: This will return true if the player has not opened the locker. 
- (Given)Combinational lock: This will interact with the code to unlock the locker.

Methods:
- look(): This will help to show everything in the locker room.
- examine(): This will help to get the information to open the locker room.
- unlock(Player player): This will interact with the CombinationLock and unlock the locker if the code is correct.
- openLocker(): This method will help the player open the locker.
- takeCleats(): This method will help the player take cleats from the locker.


### Common game commands:
look command: This will help you see the objects around you everywhere.

examine (object): This will help you know the details about the object you want to use.

lift towel

take id

talk to coach

unlock locker

open locker

take cleats

inflate ball

kick ball: The players wins here by kicking the ball and score a goal.

Quit: Entering “quit” will end the game.

