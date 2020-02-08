import java.util.*;
abstract class Newyear
{
void menu()
{
System.out.println("MENU");
System.out.println("Chocolates Menu:");
System.out.println("1.whiite Chocolates \n2.milk Chocolates \n3.dark Chocolates \n4.no more Chocolates\n");}
void menu2(){
System.out.println("Sweets Menu:");
System.out.println("1.kajuSweets \n2.BadamSweets \n3.Dryfruitsweets \n4.no more swweets");
}
///void sort(int t,int price,int n);
 //void sort(int name,int p);
}
class Choco extends Newyear
{
float sort()
{   Scanner sc=new Scanner(System.in);
    System.out.println("enter the type of Chocolate you have");
    int c=sc.nextInt();
    System.out.println("enter number of chocolate pieces:");
    int n=sc.nextInt();
    int[] weight= new int[]{20,30,45,50};
    
    return weight[c]*n;
}
    
}
class sweets extends Newyear
{
float sort(int name,int n)
{
float weight_s=0;
int price[]={40,50,27,85};
return price[name]*n;
}
}
public class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Choco c=new Choco();
sweets s=new sweets();
c.menu();
float c_wt=c.sort();
System.out.println("enter the name of sweet using its number given in menu:");
s.menu2();
int name=sc.nextInt();
System.out.println("enter number of sweets:");
int p=sc.nextInt();
float s_wt=s.sort(name,p);
System.out.println("toatl weight of gift:"+ (c_wt+s_wt));
System.out.println("total number of candies and sweets in gift:"+ (p));
}
}
