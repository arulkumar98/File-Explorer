import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
public class fileCopy extends greetings{
   public void copy() throws IOException {
       Scanner in = new Scanner(System.in);
       System.out.println(example);
       File src = new File("sample.java");
       System.out.println(output);
       File dest = new File(in.nextLine());
       System.out.println("File Saved Location: " +dest);
       Files.copy(src.toPath(), dest.toPath());
   }
}