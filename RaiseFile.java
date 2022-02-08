import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
// подключаем нужные классы и пакеты





public class RaiseFile {
    
    public static void main(String[] args) throws IOException {
Scanner sc = new Scanner(System.in); // создаем объект сканер для чтения из консоли
System.out.println("Введите URL файла.");
	String image = sc.nextLine(); // задаем переменную "картинка", с присвоением значения из консоли

URL url = new URL(image); // создаем объект ЮРД, с адресом полученным из консоли
InputStream input = url.openStream(); // получает InputStream у интернет-объекта
System.out.println("Введите имя нового файла (с указанием расширения).");
        String fileName = sc.nextLine(); // задаем переменную "имя файла", с присвоением значения из консоли

        Files.copy(input, Paths.get(fileName)); // копируем полученные данные в новый файл
    }

}
















































































    








