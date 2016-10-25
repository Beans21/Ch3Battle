import java.util.*;
public class Battle {

	public static void main (String[] args) {
		battleStart();
		Scanner s= new Scanner(System.in);
		System.out.println("Trainer, what are your Pokemon's stats?");
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
		damage(level, attack, defense, base, hp);
		System.out.print("Moves Learned: ");
		String moveslearned= s.nextLine();
		
		
		
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
	}
	
/* Damage method prompts user for base stats and reports damage done to Pokemon. */	
	public static void damage(int level, int attack, int defense, int base, int hp) {
		System.out.println("Piplup used Whirpool!");
		double modifier= Math.random()*50;
		int damage= (((2*level*10/250)*(attack/defense)*base)+2)*(int)modifier;
		System.out.print("Your pokemon sustained " + damage + " points damage.");
		System.out.println("HP are now " + (hp-damage) + ".");
	}
	
	public static void statsTable(String moves, int level, int attack, int defense, int base, int hp) {
		System.out.print("Pokemon Stats: ");
		
	}
	
}
