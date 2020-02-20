
import java.util.*;

public class main
{
        
    public static void main(String[] args)throws CloneNotSupportedException
    {  
        ArrayList<Employee> employee =new ArrayList<Employee>();
            
        Calendar birthday0 = new GregorianCalendar();
        Calendar birthday1 = new GregorianCalendar();
        Calendar birthday2 = new GregorianCalendar();
        Calendar birthday3 = new GregorianCalendar();
        Calendar birthday4 = new GregorianCalendar();
        Calendar birthday5 = new GregorianCalendar();
        Calendar birthday6 = new GregorianCalendar();
        Calendar birthday7 = new GregorianCalendar();
        Calendar birthday8 = new GregorianCalendar(); 
        
        birthday0.set(59,2,23);
        employee.add(new Staff("Paita", "Allen", "123", "M", birthday0, 50.00));
        
        birthday1.set(64,7,12);
        employee.add(new Staff("Steven", "Zapata", "456", "F", birthday1, 35.00));
        
        birthday2.set(70,6,2);
        employee.add(new Staff("Enrique", "Rios", "789", "M", birthday2, 40.00));
        
        birthday3.set(62,4,27);
        Education edu = new Education("Ph.D", "Engineering", 3);
        employee.add(new Faculty("Anne", "Johnson", "243", "F", birthday3, Faculty.Level.FU, edu));
        
        birthday4.set(75,3,14);
        edu = new Education("Ph.D", "English", 1);
        employee.add(new Faculty("William", "Bouris", "791", "F", birthday4, Faculty.Level.AO, edu));
        
        birthday5.set(80,5,22);
        edu = new Education("MS", "Physical Education", 0);
        employee.add(new Faculty("Christopher", "Andrade", "623", "F", birthday5,Faculty.Level.AS, edu));
        
        birthday6.set(77,8,10);
        employee.add(new Partime("Augusto", "Guzman", "455", "F", birthday6, 35.00, 30));
        
        birthday7.set(97,9,15);
        employee.add(new Partime("Martin", "Depirro", "678", "F", birthday7, 30.00, 15));
        
        birthday8.set(88,11,24);
        employee.add(new Partime("Marque", "Aldaco", "945", "M", birthday8, 20.00, 35));

        int allEmployeeSalary = 0;
        for (int i=0; i<employee.size(); i++) 
        {
            System.out.println(employee.get(i));
            allEmployeeSalary += employee.get(i).monthlyEarning();
        }
        int part_timesalary = 0;
        for (int i=0;  i< employee.size(); i++) 
        {
            if(employee.get(i) instanceof Partime) 
            {
                part_timesalary += employee.get(i).monthlyEarning();
            }
        }
        
        System.out.println("\n\n\nTotol monthly salary for all part-time staff: "+ part_timesalary);
        System.out.println("Total monthly salray for all employee: " + allEmployeeSalary);
        System.out.println("\n\n\nAscending By Employee ID");
        
        Collections.sort(employee, new Sortbyid());
        for (int i = 0; i < employee.size(); i++) 
        {
            System.out.println(employee.get(i));
        }
        System.out.println("\n\n\nDescending By Employee LastName");
        Collections.sort(employee, new Sortbyln());
        for (int i = 0; i < employee.size(); i++) 
        {
            System.out.println(employee.get(i));
        }
        
        System.out.println("\n\n\nClone");
        Faculty f1 = new Faculty("Christopher", "Andrade", "623", "F", birthday5,Faculty.Level.AS, edu);
        Faculty f2 = (Faculty)f1.clone();
        f1.changeEdu("Ph.D", "Computer Science",2);
        f1.setLastname("Silva");
        System.out.println(f2.cloneOutput());
        System.out.println(f1.cloneOutput());
       }
    
}

