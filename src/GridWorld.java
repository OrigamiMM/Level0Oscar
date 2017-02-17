import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	World star = new World();
	star.show();
	Location place = new Location(5,5);
	Location ulike = new Location(6,3);
	Bug jazz = new Bug();
	Bug barry = new Bug();
	barry.setColor(Color.BLUE);
	barry.turn();
	jazz.turn();
	Flower leaf = new Flower();
	star.add(place, barry);
	star.add(ulike, jazz);
	star.add(new Location(6,2), leaf);
	star.add(new Location(6,4), leaf);
	star.add(new Location(5,4), leaf);
	star.add(new Location(5,6), leaf);
	for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		star.add(new Location(i,j) , leaf);
	}
	}
	
}

}
