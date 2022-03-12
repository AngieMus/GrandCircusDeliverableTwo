import java.util.Scanner;

public class HeadsOrTails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			 
		  Scanner CoinFlip = new Scanner(System.in);
		  System.out.println("Guess which you will you have more: Heads or Tails?");
		  //headsOrTailsGuess will hold the user’s string head or tail
		  String headsOrTailsGuess = CoinFlip.next();
		  
		
		  
		  
		  System.out.println("How many times shall we flip the coin?");
		  //numberOfFlips will hold the user's number input
		  int numberOfFlips = CoinFlip.nextInt();
		  int correctCount = 0;
		  int headsCount = 0;
		  int tailsCount = 0;
		  int randomNum; 
		  for (int i = 0; i < numberOfFlips; i++){
			  randomNum = (int) (Math.random()*2);  
			  if(randomNum == 0) {
				  System.out.println("Heads");
				  headsCount++;
				  
				  
			  }else {
				  System.out.println("Tails");
				  tailsCount++;
				  
			  }
  
			  
		  }
		  
		  //correctCount will hold the total number of correct guesses.
		  if(headsOrTailsGuess.equalsIgnoreCase("Tails")) {
			  correctCount = tailsCount;
			  
		  }else {
			  correctCount = headsCount;
		  
		  }
		  
		  double percentage = (correctCount * 100) / numberOfFlips;
		  
		  
		  
		  System.out.println("Your guess, " + headsOrTailsGuess +  " came up " + correctCount + " time(s). That is " + percentage +  "%");
		  
		  
		  
		 
		  
		  		
			  
		  }
				
		}
	}

