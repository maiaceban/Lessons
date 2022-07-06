PART 1/5: 
Description
Minesweeper is a game with a field in which there are a lot of mines. You need to find where all these mines are located.
To help you find the mines, there are cells that show how many mines are located around them.
Your first step would be easy. In this step, you need to output some state of the field.
The field contains mines marked as 'X' and safe places marked as '.', but you can choose your own symbols for marking
places with mines and safe places. Note that all the mines are in plain sight, so you don't have to hide them from
the user at this stage!
Example
In the example, there are 10 mines in a 9x9 field. You can write to the output of any
other configuration of mines.

PART 2/5: Flexible mines
Description
It is not interesting when the field has exactly the same setup every time, and you
know where all the mines are located, isn't it? To avoid that, let's generate a new random
configuration every time the user wants to play the game.
Let's improve the program and let the user choose how many mines she wants to
play with on the field. The user just needs to input a number from the keyboard.

The program should ask the user how many mines he wants to see on the field and
then display the field with mines. The mines must still be visible to the user, you will hide
them in the following stages. Make sure that mines are marked with the 'X' character
and safe fields are marked with the '.' character. Also, use a 9x9 field, the tests check
the field of this size.
In this stage, you need to use a random number generator. The class you need is
java.util.Random.
Part 3/5
