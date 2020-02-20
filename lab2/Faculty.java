import java.util.Calendar;
import java.util.Comparator;
public class Faculty extends Employee implements Cloneable
{
    public enum Level 
    {
        AS, AO, FU
    }
    private Level L;
    private Education education;
    public Faculty() 
    {
        super();
        L = Level.AS;
    }
    public Faculty(String fn,String ln,String id,String gender, Calendar bday,Level L,Education education) 
    {
        super(fn, ln, id, gender, bday);
        this.L = L;
        this.education = education;
    }
    public double monthlyEarning() 
    {
        double sal = EmployeeInfo.FACULTY_MONTHLY_SALARY;
        if (L == Level.AO){
            sal = EmployeeInfo.FACULTY_MONTHLY_SALARY * 1.50;
        }
        else if (L== Level.FU) {
            sal =EmployeeInfo.FACULTY_MONTHLY_SALARY* 2.00;
        }
        return sal;
    }
    public String toString() 
    {
        String string = "" ;
        if (L == Level.AS)
        {
        string = (super.toString() + "\n" + "Assistant professor\n" + "Professor Monthly Salary: " + monthlyEarning());
        }
        else if (L== Level.AO) 
        {
             string = (super.toString() + "\n" + "Associate Professor\n" + "Professor Monthly Salary: " + monthlyEarning());
            }
            else if(L== Level.FU)
            {
                 string = (super.toString() + "\n" + "Professor\n" + "Professor Monthly Salary: " + monthlyEarning());
            }
            return string;
    }
    public void changeEdu(String d, String m, int r)
    {
        education.setDegree(d);
        education.setMajor(m);
        education.setResearch(r);
    }
    public void setEdu(Education e)
    {
        this.education = e;
    }
    public Object clone() throws CloneNotSupportedException 
    {
        Faculty f = (Faculty)super.clone();
        f.education = (Education)this.education.clone();
        return f;
    }
    public String cloneOutput()
    {
        return (super.toString() + "\n" + "Degree: " +education.getDegree()+"\nMajor: " +education.getMajor()+ "\nResearch "+education.getMajor()+"Professor Monthly Salary: " + monthlyEarning());
    }
}
