package org.example.design;

import java.util.ArrayList;
import java.util.List;

public class Branch implements IBranch {
    private String name;
    private String position;
    private int salary;

    List<ICorp> subordinateList=new ArrayList<>();

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }

    @Override
    public List<ICorp> getSubordinate() {
        return this.subordinateList;
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
