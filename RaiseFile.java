import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.net.URL;
import java.io.InputStream;
import java.util.Scanner;
// ���������� ������ ��� ������ � ������


public class RaiseFile {
    
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in); // ������� ������ ������

System.out.println("1.������� URL �����.\n" + "2.������� \"Enter\".\n" + "3.������� �������� ������ �����.\n" + "4.������� \"Enter\".");
		
		Files.copy(new URL(sc.nextLine()).openStream(), Paths.get(sc.nextLine()));
// ������ �� ������� ����� URL. �������� InputStream � ��������-�������. �������� ���������� ������ � ����� ���� (��� ����� �������� �� �������)
    }

}
















































































    








