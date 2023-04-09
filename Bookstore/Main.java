import java.util.*;
import java.io.*;
import java.io.FileReader;

class Bookstore
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1.Adventure"+"\n"+"2.Sci-Fi"+"\n"+"3.Fiction"+"\n"+"4.Biography"+"\n"+"5.Novel"+"\n"+"6.Romance"+"\n"+"7.Real Life Events"+"\n"+"8.Magaine");
        int choice=sc.nextInt();
        Bookstore ob1=new Bookstore();
        try
        {
            ob1.genre(choice);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    void genre(int c)throws Exception
    {
        switch(c)
        {
            case 1:
            {
                FileReader fr = new FileReader("C:\\Users\\Intel\\Desktop\\Java\\Bookstore\\Adventure.txt");
                int i;

                while ((i = fr.read()) != -1){
                    System.out.print((char)i);
                }
                break;
            }
            case 2:
            {
                FileReader fr = new FileReader("C:\\Users\\Intel\\Desktop\\Java\\Bookstore\\Sci-fi.txt");
                int i;
                while ((i = fr.read()) != -1){
                    System.out.print((char)i);
                }
                break;
            }
            case 3:
            {
                FileReader fr = new FileReader("C:\\Users\\Intel\\Desktop\\Java\\Bookstore\\Fiction.txt");
                int i;
                while ((i = fr.read()) != -1){
                    System.out.print((char)i);
                }
                break;
            }
            case 4:
            {
                FileReader fr = new FileReader("C:\\Users\\Intel\\Desktop\\Java\\Bookstore\\Biography.txt");
                int i;
                while ((i = fr.read()) != -1){
                    System.out.print((char)i);
                }
                break;
            }
            case 5:
            {
                FileReader fr = new FileReader("C:\\Users\\Intel\\Desktop\\Java\\Bookstore\\Novel.txt");
                int i;
                while ((i = fr.read()) != -1){
                    System.out.print((char)i);
                }
                break;
            }
            case 6:
            {
                FileReader fr = new FileReader("C:\\Users\\Intel\\Desktop\\Java\\Bookstore\\Romance.txt");
                int i;
                while ((i = fr.read()) != -1){
                    System.out.print((char)i);
                }
                break;
            }
            case 7:
            {
                FileReader fr = new FileReader("C:\\Users\\Intel\\Desktop\\Java\\Bookstore\\Real-life-events.txt");
                int i;
                while ((i = fr.read()) != -1){
                    System.out.print((char)i);
                }
                break;
            }
            case 8:
            {
                FileReader fr = new FileReader("C:\\Users\\Intel\\Desktop\\Java\\Bookstore\\Magazine.txt");
                int i;
                while ((i = fr.read()) != -1){
                    System.out.print((char)i);
                }
                break;
            }
        }
        bill();
    }
    void bill()throws Exception
    {
        List<String> listOfStrings
                = new ArrayList<String>();
        Scanner sc = new Scanner(new FileReader("C:\\Users\\Intel\\Desktop\\Java\\Bookstore\\name.txt")).useDelimiter(",\\s*");
        String str;
        while (sc.hasNext()) {
            str = sc.next();
            listOfStrings.add(str);
        }
        String[] array
                = listOfStrings.toArray(new String[0]);


        Scanner ob=new Scanner(new FileReader("C:\\Users\\Intel\\Desktop\\Java\\Bookstore\\price.txt")).useDelimiter(",");
        List<String> list
                = new ArrayList<String>();
        while(ob.hasNext())
        {
            str=ob.next();
            list.add(str);
        }
        String[] array1
                = list.toArray(new String[0]);
        Scanner r=new Scanner(System.in);
        System.out.println("/n"+"How many books you want to Purchase");
        int count=r.nextInt();
        String pur[]=new String[count+1];
        System.out.println("Enter your purchase");
        int c=0;
        while(c<pur.length)
        {
            pur[c]=r.nextLine();
            c++;
        }
        //pur[--c]=r.nextLine();
        String[] array2 = list.toArray(new String[0]);
        System.out.println("Enter your name");
        String name=r.nextLine();
        System.out.println("Enter contact number");
        String num=r.next();
        float total=0;
        for(int j=0;j<pur.length;j++)
        {
            for(int i=0;i<array.length;i++)
            {
                if(pur[j].compareTo(array[i])==0)
                {
                    String s=array2[i].substring(1,array2[i].length());
                    System.out.println(array[i]+" - "+array1[i]);
                    total=total+Float.parseFloat(s);

                }
            }

        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Name:  "+name);
        System.out.println("Contact:  "+num);
        System.out.println("Your total is: $"+total);
    }
}
