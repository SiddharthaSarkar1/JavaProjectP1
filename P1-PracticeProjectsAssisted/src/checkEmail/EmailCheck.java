package checkEmail;

import java.util.Scanner;

public class EmailCheck {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String mail[]= new String[10];
        
        System.out.println("Enter 10 email ids: ");
        for(int i=0;i<mail.length;i++)
        {
            mail[i]=in.nextLine();
        }
        
        System.out.println("Entry Filled Ready To Search");
        
        int position =0; 
       
        System.out.println("Enter the email id that you want to search :");
         String search = in.nextLine(); 
         
           for(int i=0; i<mail.length; i++)
              {
              if(search.equals(mail[i]))
                           position = i;
              }
               if(position != 0)
               System.out.println("This Email ID is Validated: " + mail[position]);
               else
               System.out.println("Not Found - Invalid Email ID");
        }
    }