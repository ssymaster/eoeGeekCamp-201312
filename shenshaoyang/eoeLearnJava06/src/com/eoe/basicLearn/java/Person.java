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
		System.out.println("�ˣ���Һã�����" + name + "����" + age + "�꣬���" + height
				+ "�ף�����һ��" + type + sex + "ʿ��");
		System.out.println("����" + inschool +'��'+ inclass + "ѧϰ��");

	}

	public void feeling(String cause, int qian, String content) {
		System.out.println(cause + qian + content);

	}

	public void biaoyan(int a, int b) {
		System.out.println("������ұ������������ཻ�����㷨");
		System.out.println("a=" + a + "  b=" + b);
		a += b;
		b = a - b;
		a -= b;
		System.out.println("��");
		System.out.println("a=" + a + "  b=" + b);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Person p1 = new Person();
		p1.name = "������";
		p1.sex = '��';
		p1.age = 23;
		p1.height = 1.72;
		p1.type = "���ŵ�";
		p1.inschool = "eoe����ѧԺ";
		p1.inclass = "andyoid1205";
		p1.say();
		p1.feeling("�����vӍ��������н", 8, "k����������....");
		p1.biaoyan(12, 17);
   Person p2 = new Person();
		p2.name = "�ž�";
		p2.sex = 'Ů';
		p2.age = 22;
		p2.height = 1.63;
		p2.type = "�ɰ���";
		p2.inschool = "���ݴ�W";
    	p2.inclass = "�h�Z��101";
		p2.say();
		p1.feeling("���ڸ�У��������н", 6, "k��������....");
		p2.biaoyan(25, 152);

	}

}
