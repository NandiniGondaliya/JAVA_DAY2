package DAY2;
import java.util.Scanner;;

class Employee {
    private String name;
    private String address;
    private String phoneno;
    
    Scanner sc=new Scanner(System.in);
    
    public void setData(String name,String address,String phoneno)
    {
        this.name=name;
        this.address=address;
        this.phoneno=phoneno;
        
    }
    public String getName()
    {
        return name;
        
    }
    public String getno()
    {
        return phoneno;   
    }
    public String getaddr()
    {
        return address;   
    }
}
