import java.util.Scanner;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class SHEET4 {

	static public void main(String args[])
	{
		
		/*
		  int d ;

		  for (d= 0;d<=100;++d)

		  {
			 if (d % 2 == 0 && d % 3 ==0)
			 {
				 System.out.println( d+ " is divisible by 2 & 3"); 
			 }
			 else 
			 {
				 System.out.println(d+ " is NOT divisible by 2 & 3");
			 }
		  }
		 */   

		//4.4 Generating Sequences Using For Loops
		System.out.println("**4.4 Generating Sequences Using For Loops");

//Variable declaration for all loops 
		Scanner keyboard = new Scanner(System.in);
		int i,j;
		int square = 0;
		int x= 1;

		//Q1
		for(i=4;i<12;++i)
		{
			System.out.print(i+",");
		}

		/*Loop outputs have been placed on 1 line separated by a ',' for easy marking/viewing
		The println below will ensure each question is printed on new line instead of together. This has been done throughout */
		System.out.println("");

		//Q2
		for(i=10;i<20;i+=3)
		{
			System.out.print(i+",");
		}

		System.out.println("");	

		//Q3
		for(i=1;i<17;i+=3)
		{
			System.out.print(i+",");
		}

		System.out.println("");	

		//Q4
		for(i=2;i<13;i+=2)
		{
			System.out.print(i+",");
		}

		System.out.println("");	

		/*Q5  Here the loop ends at 11 because for every iteration I am squaring the variable 'i' using the variable 'square' to store the value.
		So for example it would 3*3 for the 3rd iteration */
		for(i=1;i<11;++i)
		{
			square = i*i;
			System.out.print(square+",");
		}
		// Value must be reset otherwise other loops will base their calculations of an already filled in variable.
		square = 0;

		System.out.println("");	

		//Q6 
		for(i=-10;i<11;i+=2)
		{				
			System.out.print(i+",");
		}

		System.out.println("");		

		//Q7
		for(i=-20;i<21;i+=5)
		{				
			System.out.print(i+",");
		}

		System.out.println("");	

//4.5 Generating Patterns Using For Loops
		System.out.println("**4.5 Generating Patterns Using For Loops");

		//Q1
		for(i=0;i<11;++i)
		{
			System.out.print("+");
		}

		System.out.println("");	

		//Q2
		for(i=0;i<10;++i)
		{
			System.out.print("-");
		}

		System.out.println("");	

		//Q3
		for(i=0;i<5;++i)
		{
			System.out.print("+-");
		}

		System.out.println("");		

		//Q4
		for(i=0;i<3;++i)
		{
			System.out.print("*+-");
		}

		System.out.println("");	

//Q5 Here the loop continues until 'i' is EQUAL or LESS than 3 this means there are 4 loops because the count starts from '0'
		for(i=0;i<=3;++i)
		{
			if(i == 3)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("*+-");
			}
		}

		System.out.println("");	

		//Q6 
		for(i=0;i<3;++i)
		{
			System.out.print("**++");
		}

		System.out.println("");	

		//Q7 
		for(i=0;i<2;++i)
		{
			System.out.print("***+++---");
		}

		System.out.println("");	

		//Q8 
		for(i=0;i<3;++i)
		{
			if (i==1)
			{
				System.out.print("------");
			}

			else if (i==2)
			{
				System.out.print("+++***");
			}
			else
			{
				System.out.print("***+++");
			}
		}
		System.out.println("");	

//4.6 While Loops
		System.out.println("**4.6 While Loops");	

	//While loops for Section 4.4 Q3 & Q4
		//Q3
		while (x <= 16)
		{
			System.out.print(x+ ",");
			x+=3;
		}

		/* Value 'x' has been reset because the 'for' loop sets the value when created. In the while loop it will take an already filled in variable from previous loops
			that used the same variable.*/
		x= 0;
		System.out.println("");

		//Q4   NOT FINISHED STARTS WITH 0 !@!!!@@@!! 
		while (x <= 12)
		{
			System.out.print(x+ ",");
			x+=2;
		}

		System.out.println("");

		/*Euclid's algorithm 	
			Variables for Euclid's algorithm have been placed here for easy changing during marking */
		
		
		System.out.print("Please Enter number 1: ");
		   int a = keyboard.nextInt();
		System.out.print("Please Enter number 1: ");
		   int b = keyboard.nextInt();

		while (b != 0)
		{
			if (a > b)
			{
				a = a - b;
			}
			else 
			{
				b = b - a;
			}
		}
		System.out.println("HCF is " + a);

//4.7 Nested Loops
		System.out.println("**4.7 Nested Loops");

		//Q1
		for(i=1;i<6;++i)
		{
			for(j=1;j<i+1;++j)
			{
				System.out.print(i);
			}
		}

		System.out.println("");

		//Q2
		for(i=2;i<7;++i)
		{
			for(j=1;j<i+1;++j)
			{
				System.out.print(i);
			}
		}

		System.out.println("");

		/*Q3 In this loop an 'if' statement has been placed for checking whether the 'for' loop has met condition i = 1,3,5 if so continue with the loop
		if not then the 'continue' command will come out of the for loop for that value and continue with the rest of the 'for' loop */
		for(i=1;i<6;++i)
		{
			for(j=1;j<i+1;++j)
			{
				if (i == 1 || i == 3 || i == 5)
				{
					System.out.print(i);	
				}
				else
				{
					continue;	
				}
			}
		}

		System.out.println("");

		//Q4
		for(i=1;i<8;++i)
		{
			for(j=1;j<i+1;j+=2)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7)
				{
					System.out.print(i);	
				}
				else
				{
					continue;	
				}
			}
		}

		System.out.println("");

		//Q5 The first 'for' loop here has been reversed so that it descends instead of ascending from 1 onwards
		for(i=5;i>=1;--i)
		{
			for(j=1;j<i+1;++j)
			{
				System.out.print(i);

				if (i == 1)
				{
					System.out.print(2);
				}
				else
				{
					continue;
				}
			}
		}

		System.out.println("");

		//Q6 The second 'for' loop here has been reversed
		for(i=5;i>=1;--i)
		{
			for(j=5;j>i-1;--j)
			{
				System.out.print(i);
			}
		}

		System.out.println("");

		//Q7
		for(i=1;i<6;++i)
		{
			for(j=1;j<i+1;++j)
			{
				if (i == 1 ||i == 3 ||i == 5)
				{
					System.out.print("+");
				}
				else
				{
					System.out.print("*");
				}
			}
		}

		System.out.println("");

		//Q8
		for(i=2;i<8;++i)
		{
			for(j=1;j<i+1;++j)
			{
				if (i == 2 ||i == 5)
				{
					System.out.print("-");
				}
				
				else if (i == 4 ||i == 7)
				{
					System.out.print("+");
				}
				else
				{
					System.out.print("*");
				}
			}
		}
		
		System.out.println("");
			
		/*Q1) 'for' loop for possible numbers 1-10. Outer loop starts from 1 then inner loop will increment through numbers 1-10. 
		 print line will now add the 1 from the outer loop to the 10 possible values from the inner loop.So it will be 1-1 , 1-2 , 1-3 etc.. */
		
		System.out.println("Q1 Possible Pairs between 1 and 10");
		
		for (i=1;i<11;++i)
		{
			for (j=1;j<11;++j)
			{
				System.out.println(i+"-"+j);
			}
		}

		//Q3 Based of previous loop , numbers have changed.

		System.out.println("Q2 Possible Pairs between 1,2,3,4 and 4,5,6,7,8 ");

		for (i=1;i<5;++i)
		{
			for (j=4;j<9;++j)
			{
				System.out.println(i+"-"+j);
			}
		}

		//4.8 Using Conditional Statements with your Finch
		System.out.println("3.7 Using Conditional Statements with your Finch");

		Finch myFinch = new Finch();

		/*
			//Statement is only run when Finch's nose is facing upwards
		if (myFinch.isBeakUp()){
				myFinch.setLED(255, 0, 0, 1000);
				myFinch.buzzBlocking(255, 1000);

			}
		 */

		// this block of statements will keep running if the finch's beak is NOT faced down. Once it is faced down the program should stop.
		while (!myFinch.isBeakDown())
		{

			// if the finch is upside down meaning the wheels are facing upwards then it will display this message over and over.
			if (myFinch.isFinchUpsideDown())
			{
				myFinch.stopWheels();
				System.out.println("I am on my back!");
			}

			// if the finch is NOT upside down meaning the wheels are facing any other direction besides EXACTLY upwards then it will run this block of statements
			else
			{
				System.out.println("I am NOT on my back!");

				// if statement will continue running over and over due to while loop, thus checking over and over again for obstacles and running the statements
				myFinch.setLED(0,255,0);
				if (myFinch.isObstacleLeftSide())
				{
					myFinch.setLED(255, 0, 0);
					myFinch.setWheelVelocities(-200, -200,500);
				}

				else if (myFinch.isObstacleRightSide())
				{
					myFinch.setLED(255, 0, 0);
					myFinch.setWheelVelocities(-200, -200,500);
				}

				// if there are no obstacles then the wheels will keep on spinning forwards
				else 
				{
					myFinch.setWheelVelocities(200, 200);
				}
			}
		}

		myFinch.quit();
		System.exit(0);				

	}
}
