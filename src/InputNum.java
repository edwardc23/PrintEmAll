import java.util.ArrayList;
import java.util.Scanner;

public class InputNum {

    ArrayList <String> nums= new ArrayList<>();
    ArrayList <String> inputFile;
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
        nums.add("Twenty-Four");
        nums.add("Twenty-Five");
        nums.add("Twenty-Six");


    }
    void run()
    {
        int sz= inputFile.size();
        Scanner in =  new Scanner(System.in);
        System.out.println("How many columns?");
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
                if(z>= inputFile.size()){break;}
                    String input = inputFile.get(z);

                System.out.printf(input+"%-5s"," ");
               z=z+listN;
            }
            System.out.println();
        }

    }
    void addList(ArrayList<String> input)
    {
        inputFile = input;
    }
    void print(int listN, int z)
    {
        inputFile.stream().filter(name -> )
    }
}
