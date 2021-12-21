public class GemList 

{

	private MyLinkedList gemList;

	public GemList()

	{

		gemList = new MyLinkedList();

	}

	public void insertBefore(Gem gem, int index)

	{

		if(index<0)

		{

			index = 0;

		}

		else if(index>size())

		{

			index = size();

		}

	    gemList.addBefore(gem, index);

	}

	public int size()

	{

		return gemList.getSize();

	}

	public int score()

	{

		if(size() == 0)

		{

			return 0;

		}

		int count = 1;

		int score = 0;

		int sumOfSameGems = 0;

		Gem previousGem = (Gem)gemList.get(0);

		score = previousGem.getPoints();

		for(int i = 1; i < gemList.getSize(); i++)

		{

			Gem gem = (Gem)gemList.get(i);

			if(gem.getType() == previousGem.getType())

			{

				sumOfSameGems = sumOfSameGems + gem.getPoints();

				count++;

			}

			else 

			{

				score = score + (sumOfSameGems * count);

				sumOfSameGems = 0;

				count =0;

				

			}

			previousGem = gem;

		}

		

		//Add the last group of gems

		score = score + (sumOfSameGems * count);

		return score;

	}

	public String toString()

	{

		String allGems = "";

		for(int i = 0; i < gemList.getSize(); i++)

		{

			Gem gem = (Gem)gemList.get(i);

			String gemString = gem.toString();

			allGems = allGems +", "+ gemString;

		}

		return allGems;

	}

	public void draw(double y)

	{

		double size = 0.07;

		double x = size;

		for(int i =0; i < gemList.getSize(); i++)

		{

			Gem gem = (Gem)gemList.get(i);

			

			gem.draw(x, y);

			x = x + size;

 			

		}

	}

	public static void main(String [] args)

	{

//		GemList list = new GemList();

//		System.out.println(list);

//		System.out.println("size = " + list.size() + ", score = " + list.score());

//		list.draw(0.9);		

//		

//		list.insertBefore(new Gem(GemType.BLUE, 10), 0);

//		System.out.println("\n" + list);

//		System.out.println("size = " + list.size() + ", score = " + list.score());

//		list.draw(0.8);

//		

//		list.insertBefore(new Gem(GemType.BLUE, 20), 99);  //not a mistake, should still work

//		System.out.println("\n" + list);

//		System.out.println("size = " + list.size() + ", score = " + list.score());

//		list.draw(0.7);

//		

//		list.insertBefore(new Gem(GemType.ORANGE, 30), 1);

//		System.out.println("\n" + list);

//		System.out.println("size = " + list.size() + ", score = " + list.score());

//		list.draw(0.6);

//		

//		list.insertBefore(new Gem(GemType.ORANGE, 10), 2);

//		System.out.println("\n" + list);

//		System.out.println("size = " + list.size() + ", score = " + list.score());

//		list.draw(0.5);

//		

//		list.insertBefore(new Gem(GemType.ORANGE, 50), 3);

//		System.out.println("\n" + list);

//		System.out.println("size = " + list.size() + ", score = " + list.score());

//		list.draw(0.4);

//		

//		list.insertBefore(new Gem(GemType.GREEN, 50), 2);

//		System.out.println("\n" + list);

//		System.out.println("size = " + list.size() + ", score = " + list.score());

//		list.draw(0.3);		

	}	

}