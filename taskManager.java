import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class taskManager {
    List<task> listTask = new ArrayList();
    private String judul;
    private String idTask;
    private Date deadline;
    private int priority;
    
    public void printTask(){
        if(listTask.isEmpty()){
            System.out.println("Tidak ada jadwal");
        } else {
            listTask.forEach((k) -> {
                System.out.println(k);
            });
        }
    }
    
    public void printTaskPriority(){
        Collections.sort(listTask, new sortByPriority() {} );
        for (task t : listTask) {
            System.out.println(t.getPriority()+ " " + t.getJudul()+ " " + t.getIdTask() + " " + t.getDeadline());
        }
    }
    
    public task findTask(String idTask){
        for(task t : listTask){
            if(t.getIdTask().equals(idTask)){
                return t;
            }
        }
        return null;
    }
    
    public void addTask(String judul, String idTask, Date deadline, int priority){
        listTask.add(new task(judul, idTask, deadline, priority));
        System.out.println("Task berhasil ditambahkan ke jadwal!");
    }

    public void deleteTask(String idTask){
        if(findTask(idTask).getIdTask().equals(idTask)){
            listTask.remove(findTask(idTask));
            System.out.println("Task berhasil dihapus dari jadwal!");
        } else {
            System.out.println("Task tidak ditemukan.");
        }
    }
}
