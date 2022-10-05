# SimulteneousEquationByGausElimination
This is a Java Program that helps to solve simulteneous equations of any number of equations and variables(e,g 3 by 3, 5 by 5 e.t.c)

It solves the simulteneous equation by reducing the system to Echelon Form; the variables can then be solved by back substitution

## Example<br>
Solve:<br>
&nbsp;1x + 1y -1z = 1<br>
&nbsp;8x + 3y -6z = 1<br>
-4x - 1y + 3z = 1<br>
This system has 3 equations and 4 variables, equivalent to 3 rows and 4 columns<br>
To solve this, pass in the co-efficients of each row to the program<br>

## How to run
Make sure that your Path environment variable set to the JDK containing the java executor program; then change your directory to src/Calculate.java from the command line and enter java Calculate.java
## Program Screenshot
<img src="/SolvingSimulteneousEquation.png">

From the program above, the reduced Echelon Form is:<br>
1x + 1y - 1z =  1<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- 5y + 2z = -7<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;- 1z = -4<br>
       
Then solving by back-substitution:<br>
z = 4 &nbsp;&nbsp;[ dividing both side by -1 ]<br>
y = 3 &nbsp;&nbsp;[ (-7 - 2z / 5 ) ==> (-7 -2(4)) / -5 ]<br>
x = 2 &nbsp;&nbsp;[ 1 + 1z + 1y ]<br>

<video controls width="250" src="/ux-part2.webm.mov">
Fall back</video>
