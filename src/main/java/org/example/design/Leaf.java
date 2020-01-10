package org.example.design;

public class Leaf implements ILeaf {
    private String name;
    private String position;
    private int salary;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info="";
        info="姓名:"+this.name;
        info=info+"\t职位:"+this.position;
        info=info+"\t薪水:"+this.salary;
        return info;
    }
}
