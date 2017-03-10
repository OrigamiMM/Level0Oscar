


public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
Human os = new Human("Oscar"); 

		//2. create a new Robot army of good and evil robots.
Robot ro1 = new Robot("Rob", false);
Robot ro15 = new Robot("Roberta", true);
Robot ro2 = new Robot("Robert", false);
Robot ros = new Robot("Robatta", true);
Robot rosf = new Robot("Robda", true);

		
		//3. command your robot army to destroy a human
	ro1.destroy(os);
	ro15.destroy(os);
	ro2.destroy(os);
	ros.destroy(os);
	rosf.destroy(os);
	}
}


/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}


/**
 * Robot Class
 */
//class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}


