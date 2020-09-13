package homework12.tasksFromTrainingManual;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;

/*
Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
должны быть распечатаны отдельно.
 */
public class Task36 {
    public static void main(String[] args) {
        File dir = new File("C:/Windows");
        printDirectories(dir);
        System.out.println("*******************************************");
        printFiles(dir);
    }

    private static void printDirectories(File dir) {
        int count = 0;
        for (File item : dir.listFiles()) {
            if(item.isDirectory()) {
                System.out.println("Папка " + count + ": " + item.getName());
                count++;
            }
        }
    }

    private static void printFiles(File dir) {
        int count = 0;
        for (File item : dir.listFiles()) {
            if(!item.isDirectory()) {
                System.out.println("Файл " + count + ": " + item.getName());
                count++;
            }
        }
    }

}
