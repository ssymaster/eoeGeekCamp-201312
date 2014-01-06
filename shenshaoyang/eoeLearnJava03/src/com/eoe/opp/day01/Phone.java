package com.eoe.opp.day01;

public class Phone {
	public String brand;
	public String system;
	public int cup_core;
	public double screen_size;
	public String type;
  public void say(){
		System.out.println("嗨，大家好，我是"+
			brand+"手机，机身搭载"+system+"系统，处理器为"+cup_core+"核，"
			+screen_size+"寸屏幕，外观"+type);
	}
 
 public Phone(){
	 brand="山寨";
	 system="android2.2";
	 cup_core=2;
	 screen_size=4.0;
	 type="实用";
 }
 //public Phone(String brand){
	 //this();
	// this.brand=brand;
 //}
 public Phone(String brand,String system,double screen_size){
	 this();
	 this.brand=brand;
	 this.screen_size=screen_size;
	 this.system=system;
 }
 
	/**
	 * @param args
	 */
 public static void main(String[] args) {
		// TODO Auto-generated method stub
    Phone phone1=new Phone();
     phone1.brand="小米3";
     phone1.system="android";
     phone1.cup_core=4;
     phone1.screen_size=5.0;
      phone1.type="简约。";
      phone1.say();
   Phone phone2=new Phone();
     phone2.brand="苹果4s";
      phone2.system="ios";
      phone2.cup_core=2;
      phone2.screen_size=4.0;
      phone2.type="精致。";
      phone2.say();
	 Phone phone=new Phone();
	  phone.say();
	 Phone phone3=new Phone("华为","android4.0",5.0);
	  phone3.say(); 
  }

}
