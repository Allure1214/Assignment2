import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File diploma = new File("diploma.csv");

        int index = 0;

        List<DiplomaData> diplomaLanjutan = new ArrayList<>();
        List<DiplomaData> kursusPengkhususan = new ArrayList<>();

        if(diploma.exists()) {
            System.out.println("File exists");
            System.out.println("The file in "+ diploma.getAbsolutePath());
        }

        else {
            System.out.println("File don't exists");
        }

        if(diploma.canRead()) {
            System.out.println("File is readable");
        }

        else {
            System.out.println("File is unreadable");
        }

        try(Scanner reader = new Scanner(diploma)) {
            while (reader.hasNext()) {
                String line = reader.nextLine();
                if(index > 0) {
                    String[] items = line.split(",");

                    DiplomaData data = new DiplomaData(items[0], items[1], items[2], items[3], items[4],
                                                        items[5], items[6], items[7], items[8]);

                    if (" Diploma Lanjutan".equals(items[1])) {
                            diplomaLanjutan.add(data);
                    }
                    else if ("Kursus Pengkhususan".equals(items[1])) {
                            kursusPengkhususan.add(data);
                    }

                        try(PrintWriter writer = new PrintWriter(new File("Diploma Lanjutan.txt"))){
                            for(DiplomaData row: diplomaLanjutan) {
                                    writer.println(row);
                            }
                        }

                        catch (FileNotFoundException exception) {
                            System.out.println(exception.getMessage());
                        }

                    try(PrintWriter writer = new PrintWriter(new File("Kursus Pengkhususan.txt"))){
                        for(DiplomaData row: kursusPengkhususan) {
                            writer.println(row);
                        }
                    }
                    catch (FileNotFoundException exception) {
                        System.out.println(exception.getMessage());
                    }
                    }
                index++;
                }
            }
        catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }
}