import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class view_1 {
    
    
    public String userNama(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");
        String input = scanner.nextLine();
        return input;
    }
    
    public String userEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public String taskJudul(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Judul: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public String taskId(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Task ID: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public Date taskDeadline() throws ParseException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deadline: ");
        System.out.println("dd-mm-yyyy");
        String date = scanner.nextLine();
        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(date);
        return date1;
    }
    
    public int taskPrioritas(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Prioritas: ");
        int input = scanner.nextInt();
        return input;
    }
    
    public String mainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nList task (LIST)" +
                         "\nLIST task berdasarkan prioritas (PRIOR)" +
                         "\nTambah task (ADD)" +
                         "\nHapus task (DEL)" +
                         "\nKeluar (EXIT)");
        System.out.print("\nApa yang ingin kamu lakukan: ");
        String input = scanner.nextLine();
        return input;
    }
}
