
public class LeaderBoardDemo2
{
	public static void test(RegionLeaderBoard b)
	{
		System.out.println("Region with most scores:" + b.getTopRegion());
		System.out.println("Top player:" + b.getTopPlayer());
	}

	public static void main(String[] args)
	{
		RegionLeaderBoard b = new RegionLeaderBoard();

		b.addScore("Ron Gilbert", 15000, Region.NorthAmerica);
		test(b);

		b.addScore("David Jones", 15000, Region.Europe);
		b.addScore("Notch", 100, Region.Europe);
		b.addScore("Jaakko Iisalo", 100, Region.Europe);
		test(b);

		b.addScore("Satoru Iwata", 15000, Region.Asia);
		b.addScore("Hironobu Sakaguchi", 14000, Region.Asia);
		test(b);

		b.addScore("Shigeru Miyamoto", 1000, Region.Asia);
		b.addScore("Shigeru Miyamoto", 16000, Region.Asia);
		test(b);

		b.addScore("Sid Meier", 50, Region.NorthAmerica);
		test(b);

		b.addScore("Will Wright", 50000, Region.NorthAmerica);
		test(b);

		b.addScore("Brad McQuaid", 2000, Region.NorthAmerica);
		b.addScore("Gabe Newell", 200, Region.NorthAmerica);
		test(b);

	}

}
