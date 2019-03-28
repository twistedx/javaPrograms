public class Person
{
private String name;
private String university;
private String major;

public Person(String dbLine)
{
  int dash1 = dbLine.indexOf('-');
  int dash2 = dbLine.lastIndexOf('-');
  name = dbLine.substring(0, dash1 -1);
  university = dbLine.substring(dash1 +1, dash2);
  major = dbLine.substring(dash2 +2);
}


public Person(String n, String u, String m)
{
name = n;
university = u;
major = m;

}

public void printReport()
{
  System.out.println("Name: " + name);
  System.out.println("University: " + university);
  System.out.println("Major: " + major);
}


}
