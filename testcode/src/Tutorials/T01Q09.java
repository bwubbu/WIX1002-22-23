package Tutorials;

//Display the frequency of a keyword from a web page.

import java.io.*;
import java.net.*;

public class T01Q09 {
  public static void main(String[] args) {
    int count = 0;
    try {
      URL url = new URL("https://github.com/in28minutes/java-a-course-for-beginners");
      URLConnection connection = url.openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

      String inputLine;
      StringBuilder content = new StringBuilder();
      while ((inputLine = in.readLine()) != null) {
        content.append(inputLine);
      }
      in.close();

      String[] words = content.toString().split("\\s+");
      for (String word : words) {
        if (word.toLowerCase().equals("java")) {
          count++;
        }
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
    System.out.println("The keyword 'java' appeared " + count + " times.");
  }
}//ぶるぶ:3