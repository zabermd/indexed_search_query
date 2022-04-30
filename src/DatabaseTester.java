import FileHandling.PropertiesFile;
import InputProcess.QueryPerser;

public class DatabaseTester {
    public static void main(String[] args) throws Exception {
        PropertiesFile pf = new PropertiesFile();
//        pf.createPropertiesFile();  //Initially was run for creating the text file
        String [] path = pf.getPropertiesFile();
        for(String s : path) {
            System.out.println(s);
        }
        System.out.println("1.-----------------------------------");
        QueryPerser qp = new QueryPerser("project [ student.name ] ( select[ student.admission-year < 2020] ( select [ student.batch > 01 ] ( scan [ student ] ) ) )");

    }
}
