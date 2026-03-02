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
            Task t = new Task(description);
            this.tasks[this.i] = t;
            this.i++;
        }

    }

    public void setStatus(int index, TaskStatus status) {
        if (index >= 0 && index < this.i) {
            tasks[index].setStatus(status);
        }

    }

    public void setDescription(int index, String newDescription) {

        if (index >= 0 && index < this.i) {
            this.tasks[index].setDescription(newDescription);
        }
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for (int idx = 0; idx < this.i; idx++) {
            System.out.printf("%-33s | %s%n",
                    tasks[idx].getDescription(),
                    tasks[idx].getStatus());
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