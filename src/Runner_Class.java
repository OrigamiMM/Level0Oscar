
public class Runner_Class {
	public static void main(String[] args) {
		SeaCreature Sponge = new SeaCreature("Spongebob");
		String name = Sponge.getName();
		System.out.println(name);
		Sponge.eat();
		Sponge.laugh();
		SeaCreature Pat = new SeaCreature("Patrick");
		String name1 = Pat.getName();
		System.out.println(name1);
		Pat.eat();
		Pat.laugh();
SeaCreature Squid = new SeaCreature("Squidward");
String name2 = Squid.getName();
System.out.println(name2);
Squid.eat();
Squid.laugh();
	}
}
