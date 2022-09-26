import java.io.File;
import java.util.Scanner;

public class fileReader extends greetings{
    public void Counting(){
        int count = 0;
        try {
            File file = new File("sample.java");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            System.out.println(counting + count);
            System.out.println();
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
