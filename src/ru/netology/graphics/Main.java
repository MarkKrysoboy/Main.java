package ru.netology.graphics;

import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.image.TextGraphicsConverterImpl;
import ru.netology.graphics.server.GServer;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new TextGraphicsConverterImpl(); // Создайте тут объект вашего класса конвертера

//        GServer server = new GServer(converter); // Создаём объект сервера
//        server.start(); // Запускаем

        // Или то же, но с сохранением в файл:
        PrintWriter fileWriter = new PrintWriter(new File("converted-image.txt"));
        converter.setMaxWidth(300);
        converter.setMaxHeight(200);
        fileWriter.write(converter.convert("http://goodnewsanimal.ru/_nw/52/s68261294.jpg"));
        fileWriter.close();
    }
}
