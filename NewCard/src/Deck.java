import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Deck {
	ArrayList<Card> pokercards=new ArrayList<>();
	
	public void shufflle() {
		Collections.shuffle(pokercards);
		System.out.print("The Deck was mixed\n");
	}
	public void Head() {
		Card first=pokercards.get(0);
		pokercards.remove(0);
		
		System.out.print("{"+first.suit+"}, "+"{"+first.Color+"}, "+"{"+first.value+"}, \n");
		System.out.print("{"+pokercards.size()+"}\n");
	
	}
	public void Pick() {
		
		Random r=new Random();
		int number=r.nextInt(pokercards.size());
		
		
		
		Card random=pokercards.get(number);
		pokercards.remove(number);
		
		System.out.print("{"+random.suit+"}, "+"{"+random.Color+"}, "+"{"+random.value+"}, \n");
		System.out.print("{"+pokercards.size()+"} \n");
	
	}
	public void hand() {
		ArrayList<Card> hand=new ArrayList<>();
		for(int i=0;i<5;++i) {
			Random r=new Random();
			int number=r.nextInt(pokercards.size());
			
			Card card=pokercards.get(number);
			hand.add(card);
			pokercards.remove(number);
			
			System.out.print("{"+card.suit+"}, "+"{"+card.Color+"}, "+"{"+card.value+"}, \n");
			
			
		}
		System.out.print("{"+pokercards.size()+"} \n");
		
	}
}
