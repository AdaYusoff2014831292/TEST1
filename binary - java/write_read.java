
/**
 * Write a description of class write_read here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;

public class write_read
{
    public static void main(String[] args)
    {
        String fileName = "rabbil_atul.bin";
        try{
            FileOutputStream fileOs = new FileOutputStream(fileName);
            ObjectOutputStream os = new ObjectOutputStream(fileOs);
            os.writeChars("Nama: Rabbil Atul Hadawiah");
            os.writeChars("Matrix No: 2014831292");
            os.writeChars("Gender: Female");
            os.writeChars("Emails: adayusoff@yahoo.com");
            os.close();     

        } catch (FileNotFoundException e){

            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("done");

        try{
            FileInputStream fileIs = new FileInputStream(fileName);
            ObjectInputStream is = new ObjectInputStream(fileIs);
            char c = is.readChar();
            System.out.println(c);
            is.close();
        }
        catch (FileNotFoundException e){

            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
    }
}
