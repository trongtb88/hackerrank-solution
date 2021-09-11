package DEA.Session2;

public class Student  {
    private int id;

    private String name;

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
        {
            return false;
        }
        if (obj == this)
        {
            return true;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }

        Student student = (Student) obj;
        return (this.getId() == student.getId() && this.getName().equals(student.getName()));
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getId() + getName().hashCode();
        return result;
    }
}
