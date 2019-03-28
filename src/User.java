public class User
{
  //Fields
private String firstName;
private String lastName;
private String country;
private String email;
//methods
  public User(String firstName, String lastName, String email, String country)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.country = country;


  }

  public boolean livesIn(String country)
{
  return this.country.equalsIgnoreCase(country);

}
  public String toString()
  {
    return firstName + " " + lastName + "'s email is " + email;

  }
}
