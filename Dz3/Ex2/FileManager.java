package Dz3.Ex2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    /*
     * Задача 2: Файловый менеджер (ООП, исключения)
     * 
     * Создайте класс FileManager. Этот класс должен иметь методы для выполнения
     * основных операций с файлами: чтение, запись и копирование. Каждый из этих
     * методов должен выбрасывать соответствующее исключение, если в процессе
     * выполнения операции произошла ошибка (например, FileNotFoundException, если
     * файл не найден).
     */

    public static void readeFile(String path){
        try (FileReader reader = new FileReader(path)){
            reader.read();
        } catch (RuntimeException | IOException e){
            System.out.println("Catch exception: " + e.getClass().getSimpleName());
        }
    }

    public static void writeFile(String path, String addText){
        try (FileWriter writer = new FileWriter(path)){
            writer.write(addText);
        } catch (RuntimeException | IOException e){
            System.out.println("Catch exception: " + e.getClass().getSimpleName());
        }
    }

    public static void copyFile(String path, String newFileName){
        try (FileReader reader = new FileReader(path);
            FileWriter writer = new FileWriter(newFileName)){
                while (reader.ready()){
                    writer.write(reader.read());
                }
        } catch (RuntimeException | IOException e){
            System.out.println("Catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy successfully");
    }
}
