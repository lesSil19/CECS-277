import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Employee  
{
    Calendar calendar = new GregorianCalendar();
    String firstname, lastname, idNumber, sex;
    public Calendar birthDate;

    public Employee() 
    {   
        firstname = "";
        lastname = "";
        idNumber = "";
        sex = "";
    }
    public Employee(String fn, String ln, String  id, String gender,Calendar bday) 
    {
        firstname = fn;
        lastname = ln;
        idNumber = id;
        sex = gender;
        birthDate = bday;

    }
    public String toString() 
    {
          return "\nID Employee number: " + idNumber +"\nEmployee name: "
          + firstname+ " " + lastname + "\nBirth Date: "
          +  birthDate.get(Calendar.MONTH) + "|" +
          birthDate.get(Calendar.DAY_OF_MONTH) + "|" + birthDate.get(Calendar.YEAR);
    }
    public String getFirstname() 
    {
        return firstname;
    }
    public void setFirstname(String fn) 
    {
        firstname = fn;
    }
    public String getLastname() 
    {
        return lastname;
    }
    public void setLastname(String ln) 
    {
        lastname = ln;
    }
    public String getidNumber() 
    {
        return idNumber;
    }
    public void setidNumber(String id) 
    {
        idNumber = id;
    }
    public String getSex() 
    {
        return sex;
    }
    public void setSex(String gender) 
    {
        sex = gender;
    }
    public Calendar getBirthDate() 
    {
        return birthDate;
    }
    public void setBirthDate(Calendar bday) 
    {
          birthDate = bday;
    }
    public abstract double monthlyEarning();
}
