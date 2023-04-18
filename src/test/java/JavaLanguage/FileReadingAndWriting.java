package JavaLanguage;

import org.testng.annotations.Test;
import java.io.*;

public class FileReadingAndWriting
{


    @Test
    public static void fileReader() throws IOException {
         int ch;
         FileReader fl=new FileReader("C:\\Users\\DELL\\IdeaProjects\\Interview_Maven_Project_Java\\src\\main\\resources\\readFile.txt");

         while ((ch=fl.read())!=-1)
         {
            System.out.println((char)ch);
         }
         fl.close();
    }

    @Test
    public static void bufferedReader() throws IOException
    {
        java.lang.String line;
        FileReader fl=new FileReader("C:\\Users\\DELL\\IdeaProjects\\Interview_Maven_Project_Java\\src\\main\\resources\\readFile.txt");
        BufferedReader bufferedReader=new BufferedReader(fl);

        while((line=bufferedReader.readLine())!=null)
        {
           System.out.println(line);
        }
    }

    @Test
    public static void writer() throws IOException
    {
        FileWriter fileWriter=new FileWriter("C:\\Users\\DELL\\IdeaProjects\\Interview_Maven_Project_Java\\src\\main\\resources\\writeFile.txt",false);
        fileWriter.flush();
        fileWriter.write("amit kapoor is a good boy");
        fileWriter.write("\n");
        fileWriter.write("amit kapoor is a bad boy");
        fileWriter.close();
    }

    @Test
    public static void bufferedWriter() throws IOException
    {
        FileWriter fileWriter=new FileWriter("C:\\Users\\DELL\\IdeaProjects\\Interview_Maven_Project_Java\\src\\main\\resources\\writeFile.txt",false);
        fileWriter.flush();
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write("amit kapoor is a good boy");
        bufferedWriter.newLine();
        bufferedWriter.write("amit kapoor is a bad boy");
        bufferedWriter.close();
    }

}
