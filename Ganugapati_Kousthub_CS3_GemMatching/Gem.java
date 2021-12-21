import java.awt.Font;



enum GemType {

    GREEN, BLUE, ORANGE; //define the different types of Gems, comma delimited

}



public class Gem 



{

	private int points;

	private GemType type;

	

	public Gem()

	{

		int multiplier = 3;

		int randomVal = (int) (Math.random() * multiplier) ;

		//System.out.println("the random value is: "+ randomVal);

		if(randomVal == 0)

		{

			type = GemType.GREEN;

		}

		else if(randomVal == 1)

		{

			type = GemType.BLUE;

		}

		else 

		{

			type = GemType.ORANGE;

		}

		

		

		points = (int)((Math.random()*10)+1)*5;;

		

	}

	public Gem(GemType type, int points)

	{

		this.type = type;

		this.points = points;

	}

	public GemType getType() 

	{

		return type;

	}

	public int getPoints()

	{

		return points;

	}

	public String toString()

	{

		return "Gem of Type: " + type + ", Points: " +points;

	}

	public void draw(double x, double y )

	{

		String imageToDraw = "/Users/pigeon/Downloads/GemMatching/data/gem_blue.png";

		if(type == GemType.ORANGE)

		{

			imageToDraw = "/Users/pigeon/Downloads/GemMatching/data/gem_orange.png";

		}

		else if(type == GemType.GREEN)

		{

			imageToDraw = "/Users/pigeon/Downloads/GemMatching/data/gem_green.png";

		}

		//System.out.println ("X: " + x + ", Y: " +y);

			String noOfPoints = "" + getPoints();

	    	StdDraw.picture(x,y,imageToDraw);

	    	StdDraw.text(x, y, noOfPoints);

	}

	

	/** Tester main method */

	public static void main(String [] args)

	{

//	

		final int maxGems = 16;

//		

//		// Create a gem of each type

//		Gem green  = new Gem(GemType.GREEN, 10);

//		Gem blue   = new Gem(GemType.BLUE, 20);

//		Gem orange = new Gem(GemType.ORANGE, 30);

//		System.out.println(green  + ", " + green.getType()  + ", " + green.getPoints());		

//		System.out.println(blue   + ", " + blue.getType()   + ", " + blue.getPoints());

//		System.out.println(orange + ", " + orange.getType() + ", " + orange.getPoints());

//		green.draw(0.3, 0.7);

//		blue.draw(0.5, 0.7);

//		orange.draw(0.7, 0.7);

//		

//		// A row of random gems

//		for (int i = 0; i < maxGems; i++)

//		{

//			Gem g = new Gem();

//			g.draw(1.0 / maxGems * (i + 0.5), 0.5);

//		}

		

		

		

	}

}