package network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.net.URL;
import java.io.IOException;
import java.io.InputStreamReader;


public class NetworkDownloadFile {
    public BufferedReader downloadNewFile(String str) {
        InputStream inputStream = null;
             try {
                 inputStream = new URL(str).openStream(); // Считываем в переменную типа InputStream содержимое сайта, получаем поток ввода символов
              } catch (IOException e) {
                  e.printStackTrace();
            }
              BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); // читаем текст из потока ввода символов
        return  reader;
    }
}
