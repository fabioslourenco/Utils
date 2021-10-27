import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UsandoArquivoProperties {

    // no método main

    public static void main(String args[]) throws IOException {

        Properties prop = new Properties();
        FileInputStream file = new FileInputStream("C:\\Users\\fabio\\OneDrive\\Documentos\\Programação" +
                "\\Application_Properties\\src\\test\\java\\resources\\application.properties");
        prop.load(file);
        System.out.println("Nome: "+prop.getProperty("nome.qa"));
        System.out.println("Idade: "+prop.getProperty("idade"));
    }
}
