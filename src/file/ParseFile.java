package file;

import model.Cell;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseFile {
    public void parseDownloadFile(BufferedReader reader) {
        List<Cell> cellist = new ArrayList(); // создаем пустой массив типа Cell под данные полей класса Cell



             try {
                 while (reader.ready()) {
                    String line = reader.readLine(); // присваиваем текстовой переменной текст, который прочитали с сайта
                      String[] str = line.split(";"); // разбиваем текст на строки, разделенные символом ; и кладем их в массив строк
                     cellist.add(new Cell(str[3], str[4], str[5])); // добавляем в наш созданный пустой массив только 3, 4 и 5 столбцы, разделенные ;
                }
            }
           catch (IOException e) {
                    e.printStackTrace();
               }
             System.out.println(cellist.size());
    }
}
