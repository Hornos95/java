import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите адрес файла");
        String url=sc.nextLine();
        System.out.println("Начало");
        String st=sc.nextLine();
        System.out.println("Конец");
        String ot=sc.nextLine();
        Act1 act1=new Act1();
        System.out.println(act1.fileReader(url,st,ot));

        String csv = "data.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));
        String [] record = "4,David,Miller,Australia,30".split(" ");
        writer.writeNext(record);
        writer.close();
    }


}
