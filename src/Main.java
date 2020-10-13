import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static InputNum num = new InputNum();
    public static void main(String[] args) {

        num.run();
        String currentDirectory = System.getProperty("user.dir");
        File file = new File( currentDirectory+"\\src\\Test.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void readFile(Scanner scanner)
    {
        int lgNum=0;
        String entry;
        while(scanner.hasNext())
        {
         entry=scanner.next();
            for(int x=0;x<=num.nums.size();x++)
            {
                int check= num.nums.indexOf(entry);
                if(check>lgNum){
                    lgNum=check;
                }
            }
        }
    }
}
