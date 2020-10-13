import java.util.ArrayList;
import java.util.Scanner;

public class InputNum {

    ArrayList <String> nums= new ArrayList<>();
    public InputNum()
    {
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        nums.add("Five");
        nums.add("Six");
        nums.add("Seven");
        nums.add("Eight");
        nums.add("Nine");
        nums.add("Ten");
        nums.add("Eleven");
        nums.add("Twelve");
        nums.add("Thirteen");
        nums.add("Fourteen");
        nums.add("Fifteen");
        nums.add("Sixteen");
        nums.add("Seventeen");
        nums.add("Eighteen");
        nums.add("Nineteen");
        nums.add("Twenty");
        nums.add("Twenty-One");
        nums.add("Twenty-Two");
        nums.add("Twenty-Three");
        nums.add("Twenty-four");
        nums.add("Twenty-five");
//        nums.add("Twenty-six");


    }
    void run()
    {
        int sz= nums.size();
        Scanner in =  new Scanner(System.in);
        System.out.println("How many columns");
        int col= in.nextInt();
        int listN= (sz/col);
        if(sz%col!=0)
        {
            listN=(sz/col)+1;
        }
        System.out.println(listN);
        for(int x = 0; x<listN;x++)
        {
            int z=x;
            for(int y=0; y<col;y++)
            {
                if(z>=nums.size()){break;}
                    String input = nums.get(z);

                System.out.printf(input+"%-5s"," ");
               z=z+listN;
            }
            System.out.println();
        }
//        for (var name: numbers.keySet()){
//            String key = name;
//            int value = numbers.get(name);
//            System.out.print(key + " " );
//        }
    }
}
