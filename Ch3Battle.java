import java.util.*;
public class Ch3Battle {

	public static void main (String[] args) {
		battleStart();
		
		
	}
	
/* Method allows user to choose their own Pokemon and declares the battle between my poke and
 * their pokechosen */
	public static void battleStart() {
		System.out.println("Another trainer is issuing a challenge!");
		String poke= "Piplup";
		System.out.println(poke + " appeared.");
		Scanner userInput= new Scanner(System.in);
		System.out.print("Which Pokemon do you choose? ");
		String pokechosen= userInput.nextLine();
		System.out.println("You chose " + pokechosen + "!");
		System.out.println("It's a Pokemon batle between " + pokechosen + " and " + poke +"! Go!");
		System.out.println();
		userInput.close();
	}
	
	public static void damage() {
		System.out.println("Piplup used Whirpool!");
		Scanner s= new Scanner(System.in);
		System.out.print("Trainer, what are your Pokemon's stats?");
		System.out.print("Level: ");
		int level= s.nextInt();
		System.out.print("Attack: ");
		int attack= s.nextInt();
		System.out.print("Defense: ");
		int defense= s.nextInt();
		System.out.print("Base: ");
		int base= s.nextInt();
		System.out.print("HP: ");
		int hp= s.nextInt();
		double modifier= Math.random();
		int damage= (((2*level*10/250)*(attack/defense)*base)+2)*(int)modifier;
		
	}
	
}
