package Students;

public class Students {
    private String id;
    private String name;
    private int age;
    private String addess;

    public Students() {
    }

    public Students(String id, String name, int age, String addess) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addess = addess;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddess() {
        return addess;
    }

    public void setAddess(String addess) {
        this.addess = addess;
    }
}
