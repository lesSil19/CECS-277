import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
public class Partime extends Staff 
{
    private int hoursworkedperweek;
    public Partime() 
    {
        
        hoursworkedperweek = 0;
    }
    public Partime(String fn,String ln,String id,String gender,Calendar bday,double hourlyRate, int hoursworkedperweek) 
    {
        super(fn,ln,id, gender, bday, hourlyRate);
        setHwpw(hoursworkedperweek);
    }
    public int getHwpw() 
    {
        return hoursworkedperweek;
    }
    public void setHwpw(int hoursworkedperweek) 
    {
        this.hoursworkedperweek = hoursworkedperweek;
    }
    public double monthlyEarning() 
    {
        return getHourlyRate() * hoursworkedperweek * 4;
    }
    public String toString()
    {
        return ("\nID Employee number: " + super.getidNumber() +"\nEmployee name: "
          + super.getFirstname() + " " + super.getLastname() + "\nBirth Date: "
          +  birthDate.get(Calendar.MONTH) + "|" +
          birthDate.get(Calendar.DAY_OF_MONTH) + "|" + birthDate.get(Calendar.YEAR) + "\nHours worked per month: "+(getHwpw()*4)+"\nMonthly Salary: "+ monthlyEarning());
    }
}

class Sortbyid implements Comparator<Employee>
{
    public int compare(Employee x, Employee y)
    {
        int id1 = Integer.parseInt(x.getidNumber());
        int id2 = Integer.parseInt(y.getidNumber());
        return id1 - id2;
    }
}
class Sortbyln implements Comparator<Employee>
{
    public int compare(Employee x, Employee y)
    {
        return y.getLastname().compareTo(x.getLastname());
    }
}