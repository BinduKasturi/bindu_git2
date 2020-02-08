package task;
class Sweets implements Comparable{
	int weight=1;
	String name="";
	String color="yellow"; 
	float calories=100;
	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
class chocolate extends Sweets{} 
class Galaxy extends chocolate
{
	Galaxy ()
	{
	this.name="a Galaxy";
	}
}
class Bounty extends chocolate{
	Bounty()
	{
	this.name="a Bounty";
	}
}
public class Choclates {
	public static void main(String[] args) {
		Sweets[]  allsweets = new Sweets[3];
		allsweets [0]= new Galaxy();
		allsweets [1]= new Galaxy();
		allsweets [2]= new Bounty();
		float tw =0;
		for (int i = 0; i < allsweets.length; i++) {
			Sweets s = allsweets[i];
			tw += s.weight;
		}
		System.out.println(" weight = "+tw);
		System.out.println(" Printing ");
		for (int i = 0; i < allsweets.length; i++) {
			Sweets s = allsweets[i];
			System.out.println(s.name);
		}
		}
}
