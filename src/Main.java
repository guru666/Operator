import file.ParseFile;
import network.NetworkDownloadFile;
import model.Cell;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParseFile parseFile = new ParseFile();
        NetworkDownloadFile networkDownloadFile = new NetworkDownloadFile();
        BufferedReader reader = networkDownloadFile.downloadNewFile("https://rossvyaz.ru/data/ABC-4xx.csv");
        parseFile.parseDownloadFile(reader);

  //      InputStream inputStream = null;
  //      try {
  //          inputStream = new URL("https://rossvyaz.ru/data/ABC-4xx.csv").openStream(); // Считываем в переменную типа InputStream содержимое сайта, получаем поток ввода символов
  //      } catch (IOException e) {
  //          e.printStackTrace();
  //      }
  //      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); // читаем текст из потока ввода символов



  //      List<Cell> cellist = new ArrayList(); // создаем пустой массив типа Cell под данные полей класса Cell
  //      Cell cell = new Cell(); // нужно создавать объект?


  //      try {
  //          while (reader.ready()) {
   //             String line = reader.readLine(); // присваиваем текстовой переменной текст, который прочитали с сайта
   //             String[] str = line.split(";"); // разбиваем текст на строки, разделенные символом ; и кладем их в массив строк
   //             cellist.add(new Cell(str[3], str[4], str[5])); // добавляем в наш созданный пустой массив только 3, 4 и 5 столбцы, разделенные ;
   //         }
   //     }
    //    catch (IOException e) {
    //            e.printStackTrace();
     //       }


   //         System.out.println(cellist.size()); // выводим кол-во строк в массиве





    }




}
