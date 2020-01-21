package fizzbuzz;
/*
 * dette er en fizzbuzz class
 * den skriver tallet fra input til string om tallet er delelig på 3 får du fizz om det er delelig på 5 får du buzz
 * om det er delelig på både 3 og 5 får du fizzbuzz
 * fin
 */
public class fizzbuzz {	
	public String fizz(int nummber) {
		if ( nummber % 5 == 0 && nummber % 3 == 0 && nummber !=0)  { 
			return "fizzbuzz";
		}
		else if (nummber % 3 ==0 && nummber !=0) {
			return "fizz";
		}
		else if (nummber % 5 ==0 && nummber !=0) {
			return "buzz";
		}
		return ""+nummber;
	}
	public void print1To100(){
		for (int i=1; i<101;i++ ) {
			System.out.println(fizz(i));
		}
	}
}
