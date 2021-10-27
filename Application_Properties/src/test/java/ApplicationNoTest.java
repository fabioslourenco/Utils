import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationNoTest {
    private static Properties prop;
    private static String necessitaArquivoProp;
    @Test
    public void testeApplicationProperties() throws IOException {
        prop = new Properties();
        FileInputStream file = new FileInputStream("C:\\Users\\fabio\\OneDrive\\Documentos\\Programação" +
                "\\Application_Properties\\src\\test\\java\\resources\\application.properties");
        prop.load(file);
        necessitaArquivoProp = prop.getProperty("nome.qa");
        System.out.println("Nome: "+necessitaArquivoProp);
    }
}
