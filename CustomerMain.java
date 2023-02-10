package DAY2;

import java.util.Scanner;

public class CustomerMain {
    public static void main(String a[])
    {
        String detail;
        String name,address;
        String phone;
        System.out.println("Enter the Detail:");
        Scanner sc=new Scanner(System.in);
        detail=sc.next();
        String[] res = detail.split("[,]", 0); 
        name=res[0];
        address=res[1];
        phone=res[2];
        Customer c=new Customer(name,address,phone);
        c.display();
        
        sc.close();
    }
}
