package DeliverableTwo;

import java.util.Random;
import java.util.Scanner;

public class TheCoinFlipChallenge {

	public static void main(String[] args) {

		String headsOrTails = "";
        int randomCoin;
        int point = 0;
		
	    System.out.println("Welcome to the COIN FLIP CHALLENGE!");
        Scanner scnr = new Scanner(System.in);
       
        System.out.println("What is your name?");
        String name= scnr.next();
        System.out.println("Welcome " + name + ". Do you want to do the COIN FLIP CHALLENGE? Yes/No");
        String answer = scnr.next();
        
        if (answer.equalsIgnoreCase("no")) {
        System.out.println("You are a coward " + name );
        } 
        
        if (answer.equalsIgnoreCase("yes")) {
     	 
        	Random rand = new Random();       	
        	
        	for ( int i = 0; i<5; i++) {
        	
	        	System.out.println("Heads Or Tails?");
	        	headsOrTails = scnr.next();
	        		        	
	        	// random generates 0 or 1 
	        	randomCoin = rand.nextInt(2);
	        		     	   
	        	if (headsOrTails.equalsIgnoreCase("heads") && randomCoin == 0) {
	     			  point += 1;
	        		  System.out.println("Correct!");
	        	}
	        	else if (headsOrTails.equalsIgnoreCase("tails") && randomCoin == 1) {
	        		  point += 1;	
	        		  System.out.println("Correct!");
	        	} else {
	        		  System.out.println("Wrong!");
	        	} 
     		}
        	
        	System.out.println("Thank you " + name + ". You got a score of " + point + "!");	       	
        }
        	
        scnr.close();	
        }
    
	}

     	    
        
     	    
     	    
     	    
     	 
			
			
				
				
				
    
    		 
       
     	   
   
        
	

