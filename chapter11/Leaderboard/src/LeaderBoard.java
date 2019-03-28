
public class LeaderBoard 
{
	private String top_username;
	private int top_score = 0;
	
	public boolean addScore(String username, int score)
	{
		if (score > top_score)
		{
			top_score = score;
			top_username = username;
			return true;
		}
		return false;
	}
	
	public String getTopPlayer()
	{
		return top_username;
	}
	
	public int getTopScore()
	{
		return top_score;
	}
}
