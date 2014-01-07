package com.eoe.basicLearn.java;

public class Person {
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	public String inschool;
	public String inclass;

	public void say() {
		System.out.println("嗨，大家好，我是" + name + "今年" + age + "岁，身高" + height
				+ "米，我是一个" + type + sex + "士。");
		System.out.println("俺在" + inschool +'，'+ inclass + "学习。");

	}

	public void feeling(String cause, int qian, String content) {
		System.out.println(cause + qian + content);

	}

	public void biaoyan(int a, int b) {
		System.out.println("俺给大家表演两个变量相交换的算法");
		System.out.println("a=" + a + "  b=" + b);
		a += b;
		b = a - b;
		a -= b;
		System.out.println("变");
		System.out.println("a=" + a + "  b=" + b);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Person p1 = new Person();
		p1.name = "沈少阳";
		p1.sex = '男';
		p1.age = 23;
		p1.height = 1.72;
		p1.type = "豪放的";
		p1.inschool = "eoe极客学院";
		p1.inclass = "andyoid1205";
		p1.say();
		p1.feeling("我在騰訊工作，月薪", 8, "k，哈哈哈哈....");
		p1.biaoyan(12, 17);
   Person p2 = new Person();
		p2.name = "张静";
		p2.sex = '女';
		p2.age = 22;
		p2.height = 1.63;
		p2.type = "可爱的";
		p2.inschool = "鄭州大學";
    	p2.inclass = "漢語言101";
		p2.say();
		p1.feeling("我在高校工作，月薪", 6, "k，嘻嘻嘻....");
		p2.biaoyan(25, 152);

	}

}
