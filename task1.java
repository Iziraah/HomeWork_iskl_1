import java.util.ArrayList;

//Написать методы, которые будут вызывать 3 разных вида исключений
public class task1 {

    public static void main(String[] args) {
        Except e = new Except("Exceptions");
        e.addElement(123); 
        System.out.println(e.getElement(2)); 
        e.wow();
    }
}

class Except {
    ArrayList<Integer> list;
    protected String name;

    public Except(String name) {
        list = new ArrayList<>(); 
        this.name = name;
    }

    public void addElement(Integer e) {
        list.add(e);
    }

    public Integer getElement(Integer index) {
        return this.list.get(index);
    }

    public void wow() { 
        System.out.println("wow!");
        wow();
    }
}