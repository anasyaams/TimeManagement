import java.text.ParseException;
import java.util.Date;

public class taskController {
    private view_1 View = new view_1();
    taskManager taskm = new taskManager();
    user usr = new user();
    private boolean stopProgram = false;
    
    public void jalan() throws ParseException {
        mulaiControl();
        while(!stopProgram) {
            System.exit(0);
        }
    }
    
    public void setUser(String nama, String email){
        usr.setNama(nama);
        usr.setEmail(email);
    }
    
    public void mulaiControl() throws ParseException{
        boolean isNotDone = true;
        while (isNotDone) {
            setUser(View.userNama(), View.userEmail());
                    mainMenuControl(View.mainMenu());
                    isNotDone = false;
                    while(!stopProgram) {
                        mainMenuControl(View.mainMenu());
                    }
                    break;
            
        } 
    }
    
    public void mainMenuControl(String input) throws ParseException {
        boolean isNotDone = true;
        while (isNotDone) {
            switch(input.toUpperCase()) {
                case "LIST":
                    printTaskControl();
                    isNotDone = false;
                    break;
                case "PRIOR":
                    printTaskPriorityControl();
                    isNotDone = false;
                    break;
                case "ADD":
                    addTaskControl(View.taskJudul(), View.taskId(), View.taskDeadline(), View.taskPrioritas());
                    isNotDone = false;
                    break;
                case "DEL":
                    delTaskControl(View.taskId());
                    isNotDone = false;
                    break;
                case "EXIT":
                    System.exit(0);
                    stopProgram = true;
                    isNotDone = false;
                    break;
                default:
                    System.out.println("\nInput salah!");
                    input = View.mainMenu();
            }
        }
    }
    
    public void printTaskControl(){
        taskm.printTask();
    }
    
    public void printTaskPriorityControl(){
        taskm.printTaskPriority();
    }
    
    public void addTaskControl(String judul, String idTask, Date deadline, int priority){
        taskm.addTask(judul, idTask, deadline, priority);
    } 
    
    public void delTaskControl(String idTask){
        taskm.deleteTask(idTask);
    }  
}
