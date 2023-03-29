import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
    

   
        Notebook ChuwiAH401 = new Notebook("Chuwi", "AH-401", "Black");
        Notebook SamsungS101 = new Notebook("Samsung", "S-101", "Black");
        Notebook SamsungS150 = new Notebook("Samsung", "S-150", "Green");
        Notebook AsusTUF504 = new Notebook("ASUS", "TUF-504", "Red");
        Notebook AsusTUF555 = new Notebook("ASUS", "TUF-555", "White");

        List<Notebook> NotebookList = new ArrayList<>();
        NotebookList.add(ChuwiAH401);
        NotebookList.add(SamsungS101);
        NotebookList.add(SamsungS150);
        NotebookList.add(AsusTUF504);
        NotebookList.add(AsusTUF555);


    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Введите параметр выбора: color или brand.");
        String inpuString = scanner.nextLine();
        System.out.println("Введите  цвет или бренд");
        String inpuColor = scanner.nextLine();
        if (inpuString.isBlank()|| inpuColor.isBlank()){
            System.out.println("Строка не должна быть пустой");

        }

        if (inpuString.equalsIgnoreCase("color")) {
            for (Notebook color : NotebookList) {
                if (color.getColor().equalsIgnoreCase(inpuColor)) {
                    System.out.println(color.getInfo());
                }
            }
        } if (inpuString.equalsIgnoreCase("brand")) {
            for (Notebook brand : NotebookList) {
                if (brand.getBrand().equalsIgnoreCase(inpuColor)) {
                    System.out.println(brand.getInfo());
                }
            }
        }
    }
}


