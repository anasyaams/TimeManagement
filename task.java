import java.util.Comparator;
import java.util.Date;

public class task  {
    private String judul;
    private String idTask;
    private Date deadline;
    private int priority;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIdTask() {
        return idTask;
    }

    public void setIdTask(String idTask) {
        this.idTask = idTask;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    
    
    public task(String judul, String idTask, Date deadline, int priority){
        this.judul = judul;
        this.idTask = idTask;
        this.deadline = deadline;
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        return idTask + " judul: " + judul + " deadline: " + deadline + " prioritas: " + priority;
    }
}

class sortByPriority implements Comparator<task> {
    public int compareTo(task a, task b) {
        return a.getPriority()-b.getPriority();
    }

    @Override
    public int compare(task t, task t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
