import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static InputNum num = new InputNum();
    public static void main(String[] args) {


        String currentDirectory = System.getProperty("user.dir");
        File file = new File( currentDirectory+"\\src\\Test.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        num.addList(readFile(scanner));
        num.run();
    }
    private static ArrayList<String> readFile(Scanner scanner)
    {
        int lgNum=0;
        String entry;
        ArrayList<String> input = new ArrayList<>();
        int checked =0;
        while(scanner.hasNext())
        {
         entry=scanner.next();
         if(lgNum==0)
         {
             input.add(entry);
             lgNum=num.nums.indexOf(entry);
         }
         else
         {
                for(int x=0;x<=num.nums.size();x++)
                {
                    int check= num.nums.indexOf(entry);

                    if(x<input.size()){
                        if(check<= num.nums.indexOf(input.get(x))&&checked==0)
                        {
                            input.add(x,entry);
                            checked=1;
                        }
                        else if(check>= num.nums.indexOf(input.get(x))&&checked==0&&x==(input.size()-1))
                        {
                            input.add(entry);
                            checked=1;
                        }
                    }

                }
               checked=0;
            }
        }
        return input;
    }

}
