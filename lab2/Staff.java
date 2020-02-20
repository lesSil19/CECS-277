//Staff.java file
import java.util.Calendar;
public class Staff extends Employee 
{
	private double hourlyRate;
	public Staff() 
	{
        	super();
        	hourlyRate = 0.00;
	}
	public Staff(String firstname,String lastname,String id,String sex,Calendar bday,double hourlyRate)
	{
		super(firstname, lastname, id, sex, bday);
		setHourlyRate(hourlyRate);
	}
	public double getHourlyRate() 
	{
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) 
	{
		this.hourlyRate = hourlyRate;
	}
	public double monthlyEarning() 
	{
		return hourlyRate*160;
	}
	public String toString()
	{
		return (super.toString()+"\nMonthly Salary: "+ monthlyEarning());
	}
}
