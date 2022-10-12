package main;

public class Multinumber {
	public String check(int num){
		if(num>0 && num<101) {
			
		if(num %3 == 0 && num %5 == 0) {
			return "FizzBuzz";
		}
		else if(num %3 == 0){
	  		return "Fizz";
	    }
	  	else if(num %5 == 0) {
	  		return "Buzz";
	  	}
	  	else {
	  		String j = String.valueOf(num);
	  		return j;
	  	}}
		return "over 1-100";
		}
	}
