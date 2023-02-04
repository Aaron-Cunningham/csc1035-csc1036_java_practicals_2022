public class Storage {

    int storage;
    String name;
    String Make;

    Storage(int storage, String name, String make) {
        this.storage = storage;
        this.name = name;
        Make = make;
    }
    // fields to complete

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "Storage: " + storage + "GB" + "\n" +
                "Name: " + name + '\n' +
                "Make: " + Make;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

}
