import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String suite[]=new String[4];
		suite[0]="Spade";
		suite[1]="Club";
		suite[2]="Diamond";
		suite[3]="Heart";
		
		String colors[]=new String[2];
		colors[0]="red";
		colors[1]="black";
		
		
		Deck deck=new Deck();
		
		for(int i=0;i<4;++i) {
			
			Random r=new Random();
			int color_num=r.nextInt(2);
			deck.pokercards.add(new Card(suite[i], colors[color_num], "King"));
			deck.pokercards.add(new Card(suite[i], colors[color_num], "Queen"));
			deck.pokercards.add(new Card(suite[i], colors[color_num], "Jack"));
			deck.pokercards.add(new Card(suite[i], colors[color_num], "Ace"));
			
			for(int j=2;j<11;++j) {
				deck.pokercards.add(new Card(suite[i], colors[color_num], String.valueOf(j)));
			}
			
		}
		deck.shufflle();
		deck.Head();
		deck.Pick();
		deck.hand();
		
				
		
	}

}
