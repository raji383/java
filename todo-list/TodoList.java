public class TodoList {
    private Task[] tasks;
    private int capacity;
    private int i;

    public TodoList(int capacity) {
        this.capacity = capacity;
        this.tasks = new Task[capacity];
        i = 0;
    }

    public void addTask(String description) {
        if (this.i < this.capacity) {
            Task t = new Task();
            t.setDescription(description);
            t.setStatus(TaskStatus.NEW);
            this.tasks[this.i] = t;
            this.i++;
        } else {
            System.out.println("TodoList is full!");
        }

    }

    public void setStatus(int index, TaskStatus status) {
        if (index < 0 || index >= this.i) {
            System.out.println("Invalid index");
            return;
        }
        if (this.tasks[index] == null) {
            System.out.println("No task at given index");
            return;
        }
        this.tasks[index].setStatus(status);

    }

    public void setDescription(int index, String newDescription) {
        if (index < 0 || index >= this.i) {
            System.out.println("Invalid index");
            return;
        }
        if (this.tasks[index] == null) {
            System.out.println("No task at given index");
            return;
        }
        this.tasks[index].setDescription(newDescription);
    }

    public void displayTasks() {
        for (int idx = 0; idx < this.i; idx++) {
            Task t = this.tasks[idx];
            String desc = (t == null || t.getDescription() == null) ? "(no description)" : t.getDescription();
            String status = (t == null || t.getStatus() == null) ? "(no status)" : t.getStatus().toString();
            System.out.println(idx + ": " + desc + " | " + status);
        }
    }

    public static void main(String[] args) {
        TodoList myList = new TodoList(3); // List can hold up to 3 tasks
        myList.addTask("Go grocery shopping");
        myList.addTask("Pay electricity bill");
        myList.setStatus(0, TaskStatus.COMPLETED); // Mark the first task as completed
         myList.setDescription(1, "Pay all utility bills"); // Update the description
        // of the second task
         myList.displayTasks(); // Display the list of tasks
    }
}