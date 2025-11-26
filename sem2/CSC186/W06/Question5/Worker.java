package W06.Question5;

public class Worker {
    private String wkrName;
    private String wkrId;
    private String wkrContact;

    public Worker(String wkrName, String wkrId, String wkrContact) {
        this.wkrName = wkrName;
        this.wkrId = wkrId;
        this.wkrContact = wkrContact;
    }

    public void setWorker(String wkrName, String wkrId, String wkrContact) {
        this.wkrName = wkrName;
        this.wkrId = wkrId;
        this.wkrContact = wkrContact;
    }

    public String getWorkerName() {
        return wkrName;
    }

    public String getWorkerId() {
        return wkrId;
    }

    public String getWorkerContact() {
        return wkrContact;
    }
}
