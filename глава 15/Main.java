import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        TransformerFactory factory = TransformerFactory.newInstance();
        try {
            Source xslt = new StreamSource(new File("papers.xslt"));
            Transformer transformer = factory.newTransformer(xslt);

            Source text = new StreamSource(new File("papers.xml"));
            transformer.transform(text, new StreamResult(new File("output.txt")));

            System.out.println("Трансформация завершена. Проверьте файл output.txt на наличие результатов.");
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}