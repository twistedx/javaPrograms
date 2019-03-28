public class RegionLeaderBoard extends LeaderBoard {

   protected int naCount = 0;
   protected int europeCount = 0;
   protected int asiaCount = 0;



    public boolean addScore(String username, int score, Region Region) {
         super.addScore(username, score);
        if (Region == Region.NorthAmerica)
        {
            naCount++;
        }
        else if ((Region == Region.Europe)){
            europeCount++;
        }else if ((Region == Region.Asia)){
            asiaCount++;
        }
        return true;
    }
    public int getNorthAmericaCount(){ return naCount;}
    public int getAsiaCount(){
        return asiaCount;
    }
    public int getEuropeCount(){
        return europeCount;
    }

    public String getTopRegion() {
        int highest = 0;
        if ((naCount > europeCount) && (naCount > asiaCount)) { highest = naCount;  return "North America";}
        else if ((europeCount > naCount) && (europeCount > asiaCount))
        {highest = europeCount; return "Europe"; }
       else if ((asiaCount > naCount) && (asiaCount > europeCount))
        { highest = asiaCount; return  "Asia"; }

       return "Null";
    }
}


