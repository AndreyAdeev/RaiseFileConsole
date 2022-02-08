import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.net.URL;
import java.io.InputStream;
import java.util.Scanner;
// подключаем нужные нам классы и пакеты


public class RaiseFile {
    
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in); // создаем объект Сканер

System.out.println("1.Введите URL файла.\n" + "2.Нажмите \"Enter\".\n" + "3.Введите название нового файла.\n" + "4.Нажмите \"Enter\".");
		
		Files.copy(new URL(sc.nextLine()).openStream(), Paths.get(sc.nextLine()));
// читаем из консоли адрес URL. получает InputStream у интернет-объекта. копируем полученные данные в новый файл (имя файла получаем из консоли)
    }

}
















































































    








