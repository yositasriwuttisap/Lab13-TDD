package main;

public class Multinumber {
		public String check(int num){
			if(num %3 == 0 && num %5 == 0) {
				return "FizzBuzz";
			}
			else if(num %3 == 0){
		  		return "Fizz";
		    }
		  	else if(num %5 == 0) {
		  		return "Buzz";
		  	}
		    return "0";
			}
	}
