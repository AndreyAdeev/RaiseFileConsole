import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
// ���������� ������ ������ � ������





public class RaiseFile {
    
    public static void main(String[] args) throws IOException {
Scanner sc = new Scanner(System.in); // ������� ������ ������ ��� ������ �� �������
System.out.println("������� URL �����.");
	String image = sc.nextLine(); // ������ ���������� "��������", � ����������� �������� �� �������

URL url = new URL(image); // ������� ������ ���, � ������� ���������� �� �������
InputStream input = url.openStream(); // �������� InputStream � ��������-�������
System.out.println("������� ��� ������ ����� (� ��������� ����������).");
        String fileName = sc.nextLine(); // ������ ���������� "��� �����", � ����������� �������� �� �������

        Files.copy(input, Paths.get(fileName)); // �������� ���������� ������ � ����� ����
    }

}
















































































    








