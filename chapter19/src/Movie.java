public class Movie implements Comparable<Movie>{

  private String name;
  private String genre;
  private int year;

  public Movie(String name, String year, String genre){

    this.name = name;
    this.year = Integer.parseInt(year);
    this.genre = genre;

  }

  public String toString(){
    return name + " [" + year + "] " + genre;

  }


  public int compareTo(Movie other) {
    if ( year < other.year)
    return -1;
    else if (this.year == other.year)
      return name.compareTo(other.name);
    else
      return +1;
  }
}
