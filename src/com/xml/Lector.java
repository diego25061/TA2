package com.xml;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class Lector {
	
	public static String leer(String tag, String subtag){

	      try {	
	         File inputFile = new File("xml//valores.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         NodeList nList = doc.getElementsByTagName(tag);
	         
	         Node nNode = nList.item(0);
	         Element e = (Element) nNode;
	            return e.getElementsByTagName(subtag).item(0).getTextContent();
	         
	      } catch (Exception e) {
		         e.printStackTrace();
		      }
		return null;

	}
	
	public static void main(String [] args){
		
	      try {	
	         File inputFile = new File("xml//valores.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element :" 
	            + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("student");
	         System.out.println("----------------------------");
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :" 
	               + nNode.getNodeName());
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Student roll no : " 
	                  + eElement.getAttribute("rollno"));
	               System.out.println("First Name : " 
	                  + eElement
	                  .getElementsByTagName("firstname")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Last Name : " 
	               + eElement
	                  .getElementsByTagName("lastname")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Nick Name : " 
	               + eElement
	                  .getElementsByTagName("nickname")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Marks : " 
	               + eElement
	                  .getElementsByTagName("marks")
	                  .item(0)
	                  .getTextContent());
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }

	}
}
