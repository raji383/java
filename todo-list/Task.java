enum TaskStatus {
    NEW, IN_PROGRESS, COMPLETED
}

public class Task {
    private String description;
    private TaskStatus status;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setStatus(TaskStatus s) {
        this.status = s;
    }

    public TaskStatus getStatus() {
        return this.status;
    }
}


