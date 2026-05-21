import java.util.ArrayList;

public class TaskManager {
    private ArrayList<String> tasks = new ArrayList<>();
    public boolean add(String title){
        if (title.trim().isEmpty()) {
            System.out.println("Task cannot be empty!");
            return false;
        } else {
            if (tasks.contains(title)) {
                return false;
            } else {
                tasks.add(title);
                return true;
            }
        }
    }

    public boolean remove(String name){
        if (name.trim().isEmpty()) {
            System.out.println("Task cannot be empty!");
            return false;
        } else {
            if (tasks.contains(name)) {
                tasks.remove(name);
                return true;
            } else {
                return false;
            }
        }
    }

    public void view(){
        if(!tasks.isEmpty()){
            System.out.println("=== TASKS ===");

            for(int i = 0; i < tasks.size(); i++){
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        } else {
            System.out.println("No tasks yet. Add one first!");
            return;
        }
    }

    public boolean contains(String name){
        return tasks.contains(name);
    }
}
