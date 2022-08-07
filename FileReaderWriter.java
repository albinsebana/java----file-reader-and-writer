import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReaderWriter
{
    public static void main(String[]args)
    {
        try
        {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            //FileWrite writer=new FileWriter("MyFile.txt",true);
            writer.write("hello welcome to java");
            FileReader reader=new FileReader("MyFile.txt");
            int character;
            while((character=reader.read())!=-1)
            {
                System.out.print((char)character);

            }
            reader.close();
            writer.write("\r\n");
            writer.write("good Bye");
            writer.close();

        }
        catch(IOException e)
        {
        e.printStackTrace();
    }
    }
    }