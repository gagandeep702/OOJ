import java.util.Scanner;
class quadraticequation
{
 public static void main(String args[])
   {
     Scanner s =new Scanner(System.in);
     System.out.println("enter the values of a, b and c");
     double a,b,c,d,r1,r2;
      a=s.nextFloat();
       if(a==0)
       {
         System.out.println("inavlid input");
       }
    else
    {      
      b=s.nextFloat();
      c=s.nextFloat();
      d=(b*b)-(4*a*c);
  
       if(d>0)
         {
            r1=(-b+Math.pow(d,0.5))/(2*a);
            r2=(-b-Math.pow(d,0.5))/(2*a);
           System.out.println("Roots are real and distinct");
           System.out.println(" the values are " +r1+"and" + r2);
          }
       else if(d==0)
         {
           r1=-b/(2*a);
           System.out.println("Roots are equal and the values are" + r1);
         }
       else
         {
           r1=-b/(2*a);
           r2=(Math.sqrt(Math.abs(d)))/(2*a);
           System.out.println("Roots are imaginary and values are" + r1+ "+i" +Math.abs(r2)+ "and" +r1+ "-i"+Math.abs(r2));
         }
     }
   }
}