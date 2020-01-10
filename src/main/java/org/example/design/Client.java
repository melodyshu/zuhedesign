package org.example.design;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Branch ceo=compositeCorpTree();
        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));
    }

    private static String getTreeInfo(Branch root) {
        List<ICorp> subordinateList = root.getSubordinate();
        String info="";
        for (ICorp corp : subordinateList) {
            if(corp instanceof Leaf){
                info=info+corp.getInfo()+"\n";
            }else{
                info=info+corp.getInfo()+"\n"+getTreeInfo((Branch) corp);
            }
        }
        return info;

    }

    private static Branch compositeCorpTree() {
        Branch root=new Branch("王大麻子","总经理",100000);

        //3个部门经理
        Branch developDep=new Branch("刘大瘸子","研发部经理",10000);
        Branch salesDep=new Branch("马儿拐子","销售部经理",20000);
        Branch financeDep=new Branch("赵三驼子","财务部经理",30000);

        //3个小组长
        Branch firstDepGroup=new Branch("杨三大爷","研发一组组长",5000);
        Branch secondDepGroup=new Branch("吴大棒槌","研发二组组长",6000);
        Leaf zhenglaoliu=new Leaf("郑老六","研发部副经理",20000);

        //小兵
        Leaf a=new Leaf("a","开发人员",2000);
        Leaf b=new Leaf("b","开发人员",2000);
        Leaf c=new Leaf("c","开发人员",2000);
        Leaf d=new Leaf("d","开发人员",2000);
        Leaf e=new Leaf("e","开发人员",2000);
        Leaf f=new Leaf("f","开发人员",2000);
        Leaf g=new Leaf("g","开发人员",2000);
        Leaf h=new Leaf("h","销售人员",2000);
        Leaf i=new Leaf("i","销售人员",2000);
        Leaf j=new Leaf("j","财务人员",2000);
        Leaf k=new Leaf("k","CEO秘书",2000);

        //开始组装
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);
        root.addSubordinate(k);

        developDep.addSubordinate(firstDepGroup);
        developDep.addSubordinate(secondDepGroup);
        developDep.addSubordinate(zhenglaoliu);

        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);

        financeDep.addSubordinate(j);

        firstDepGroup.addSubordinate(a);
        firstDepGroup.addSubordinate(b);
        firstDepGroup.addSubordinate(c);

        secondDepGroup.addSubordinate(d);
        secondDepGroup.addSubordinate(e);
        secondDepGroup.addSubordinate(f);
        return root;
    }
}
