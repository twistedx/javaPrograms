public class CreditCard {

  private String num;
  private StringBuilder c = new StringBuilder();
  private StringBuilder d = new StringBuilder();
  private String temp;

  public CreditCard(String num) {

    char[] b = num.toCharArray();

    for (int i = 0; i < num.length(); i++) {
      if (Character.isDigit(b[i])) {
        c.append(b[i]);
      }

    }

  }


  public String toString() {
    return getIssuer();
  }

  public String getIssuer(){



              if (c.length() < 2){
                return c.append(" was issued by Unknown and is not valid.").toString();
              } else
                {


                 temp = c.toString();

                if (temp.startsWith("300") || temp.startsWith("305") || temp.startsWith("36") || temp.startsWith("38")) {
                  return c.append(" was issued by Diner's Club "+ Check(c.toString())).toString();

                } else if (temp.startsWith("34") || temp.startsWith("37")){
                  return c.append(" was issued by American Express "+ Check(c.toString())).toString();
                } else if (temp.startsWith("4")) {
                  return c.append(" was issued by VISA ."+ Check(c.toString())).toString();
                } else if (temp.startsWith("51") || temp.startsWith("52") || temp.startsWith("53") || temp.startsWith("54") || temp.startsWith("55")){
                  return c.append(" was issued by MasterCard "+ Check(c.toString())).toString();
                } else if (temp.startsWith("6011")) {
                  return c.append(" was issued by Discover " + Check(c.toString())).toString();
                } else {
                  return c.append(" was issued by Unknown " + Check(c.toString())).toString();
                }


              }

  }

  public String Check(String ccNumber)
  {
    int sum = 0;
    boolean alternate = false;
    for (int i = ccNumber.length() - 1; i >= 0; i--)
    {
      int n = Integer.parseInt(ccNumber.substring(i, i + 1));
      if (alternate)
      {
        n *= 2;
        if (n > 9)
        {
          n = (n % 10) + 1;
        }
      }
      sum += n;
      alternate = !alternate;
    }
    boolean a = (sum % 10 == 0);
      if (a){

      return d.append("and is valid.").toString();
      } else {
        return d.append("and is not valid.").toString();
      }


  }
  }




