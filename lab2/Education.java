public class Education implements Cloneable
{
    private String Degree, Major;
    private int research;
    public Education() 
    {
        Degree = "";
        Major = "";
        research = 0;
    }
    public Education(String Degree,String Major,int research) 
    {
        this.Degree = Degree;
        this.Major = Major;
        this.research = research;
    }
    public String getDegree()
    {
        return Degree;
    }
    public void setDegree(String Degree) 
    {
        this.Degree = Degree;
    }
    public String getMajor() 
    {
        return Major;
    }
    public void setMajor(String Major) 
    {
        this.Major = Major;
    }
    public int getResearch() 
    {
        return research;
    }
    public void setResearch(int research) 
    {
        this.research = research;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
