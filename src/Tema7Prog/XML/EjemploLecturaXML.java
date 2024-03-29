package Tema7Prog.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class EjemploLecturaXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document document = builder.parse(new File("org/ieslosremedios/daw1/prog/ut7/xml/ejemplo.xml"));

        System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());
        NodeList estudiantes = document.getElementsByTagName("estudiante");
        for (int i = 0; i < estudiantes.getLength(); i++) {
            Node nodeEstudiante = estudiantes.item(i);
            if (nodeEstudiante.getNodeType() == Node.ELEMENT_NODE) {
                Element elementEstudiante = (Element) nodeEstudiante;
                NodeList nodosDeEstudiante = elementEstudiante.getChildNodes();
                for (int j = 0; j < nodosDeEstudiante.getLength(); j++) {
                    System.out.println(elementEstudiante.getTextContent());
                }
            }
        }
    }
}
