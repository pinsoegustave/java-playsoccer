## Play Soccer Game Project Design (Java)

Cristiano is new to Pittsburgh, and he wants to play soccer sometime. He walks near Rooney Field and sees some guys playing soccer, and wants to join them. However, playing with them isn’t that easy; there are some rules to follow to join the team. You will help Cristiano play and score a goal.

### Goal: Help Cristiano score a goal.

### Rules to play soccer and score a goal.
You must first speak with the head coach. He is eligible to know if you have an ID (member of the Duquesne community).
You must wear cleats. 
- The head coach will help you get them.
You will need to unlock the locker room with a combination lock: 10-10-25, given by the head coach, and take the cleats.
After having cleats, you will inflate the ball on the field.
Kick the ball to score a goal.


### Pathway to winning:
Lift the towel: You will first need an ID to play, and the ID is hidden inside the towel. You just lift the towel and take your ID.
Talk to the coach: You must have an ID to talk to the coach.
Give code: The coach will give you the code to unlock the locker to take cleats from. 
Unlock locker: You will have to unlock the locker room to take cleats.
Inflate the ball: There is a ball on the field, and you have to inflate it before kicking it. You have to kick it after to score a goal (Cristiano scores, the game ends).



## Classes
### Bench Class
Attributes: 
Methods:
- getID(): To pick the ID from the towel.

### Player Class
Attributes:
- Boolean hasID: This will return TRUE, if the player hasID.
- Boolean hasCleats: This will return TRUE, if the player has get the cleats.
- Boolean hasTalkedToCoach: This will return TRUE, if the player has talked to the coach.
Methods:
- look(): This will be called when the player is looking around the field. It will say that the player is seeing the coach, the bench, and the locker.
- liftTowel(): This method will run for the player to lift the towel to get the ID.
- takeID(): This method will help the player to take the ID from the towel.
- talkCoach(): This method will make the player talk to coach and get more rules.
- getCode(): This method will help the player receive the code from the coach
- openLocker(): This method will help the player open the locker.
- takeCleats(): This method will help the player take cleats from the locker.

### Ball Class
Attributes:
- Boolean isInflated: This will return TRUE, if the player inflated the ball.
- Boolean isKicked: This will return TRUE, when the player kicks the play and decides that the player has won the game.
Methods:
- inflate(): This method will run to make the player inflate the ball.
- kick(): This method will run to make player kick the ball.

### Locker Class
Attributes: 
- Boolean open: This will return true if the locker has been opened.
- Boolean hasCleats: This will return true if the player has picked the cleats.
- Boolean isLocked: This will return true if the player has not opened the locker. 
Methods:
- look(): This will help to show everything around in the room.
- examine(): This will help to get the information to open the locker room and locker space.
- unlock(): This will interact with the CombinationationLock and unlock the locker if the code is correct.

### Common game commands:
- Start command: “start game” will welcome you and start the game.
- Look command: This will help you see the objects around you everywhere.
- Examine command: This will help you know the details about the object you want to use.
Quit command: Entering “quit” will end the game.
