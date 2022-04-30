package FileHandling;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesFile {
    public void createPropertiesFile() throws Exception {
        Properties p = new Properties();
        OutputStream os = new FileOutputStream("db.properties");
        FileOutputStream student = new FileOutputStream("student.bin");
        FileOutputStream faculty = new FileOutputStream("faculty.bin");
        BufferedWriter f_writer = new BufferedWriter(new FileWriter("index.txt"));
        f_writer.write("This is index tree");
        f_writer.close();
        Path studentPath = Paths.get("student.bin");
        Path facultyPath = Paths.get("faculty.bin");
        p.setProperty("student", studentPath.toString());
        p.setProperty("faculty", facultyPath.toString());

        p.store(os, null);
    }
    public String[] getPropertiesFile() throws Exception {
        Properties p = new Properties();
        InputStream is = new FileInputStream("db.properties");
        p.load(is);
        String[] location = new String[2];
        location[0] = p.getProperty("student");
        location[1] = p.getProperty("faculty");
        return location;
    }
}
