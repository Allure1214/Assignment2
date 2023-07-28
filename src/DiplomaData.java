import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiplomaData {
    public String bil;
    public String category;
    public String name;
    public String year2014;
    public String year2015;
    public String year2016;
    public String year2017;
    public String year2018;
    public String year2019;

    public DiplomaData(String bil, String category, String name, String year2014, String year2015, String year2016,
                       String year2017, String year2018, String year2019) {

        this.bil = bil;
        this.category = category;
        this.name = name;
        this.year2014 = year2014;
        this.year2015 = year2015;
        this.year2016 = year2016;
        this.year2017 = year2017;
        this.year2018 = year2018;
        this.year2019 = year2019;
    }
            public int getYear2014(){
                return Integer.parseInt(year2014);
            }
            public int getYear2015(){
                return Integer.parseInt(year2015);
            }

            public int getYear2016(){
                return Integer.parseInt(year2016);
            }

            public int getYear2017(){
                return Integer.parseInt(year2017);
            }

            public int getYear2018(){
                return Integer.parseInt(year2018);
            }

            public int getYear2019(){
                return Integer.parseInt(year2019);
            }

            public int getTotal () {
                return Integer.parseInt(year2014) + Integer.parseInt(year2015) + Integer.parseInt(year2016) +
                        Integer.parseInt(year2017) + Integer.parseInt(year2018) + Integer.parseInt(year2019);
            }
            @Override
            public String toString () {
                return bil + ". " + " Category = " + category + ", Name = " + name + ", Year 2014 = " + year2014 +
                        ", Year 2015 = " + year2015 + ", Year 2016 = " + year2016 + ", Year 2017 = " + year2017 + ", " +
                        "Year 2018 = " + year2018 + ", Year 2019 = " + year2019;
            }
}