package com.eoe.BasicLearn.day04;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// yte��ĳ��÷���
        int a=Byte.MIN_VALUE;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(a);
		byte byte_value=Byte.parseByte("127");
		System.out.println(byte_value);
		//Short��ĳ��÷���
		System.out.println(Short.MAX_VALUE+"\n"+Short.MIN_VALUE);
		short short_value=Short.parseShort("16000");
		System.out.println(short_value);
		//Integer��ĳ��÷���
		System.out.println(Integer.MAX_VALUE+"\t"+Integer.MIN_VALUE);
		int int_value=Integer.parseInt("12345");
		System.out.println(int_value);
		String binaryValue=Integer.toBinaryString(16);
		String octaValue=Integer.toOctalString(16);
		String hexValue=Integer.toHexString(16);
		System.out.println("16ת��Ϊ������Ϊ��"+binaryValue);
		System.out.println("16ת��Ϊ�˽�����Ϊ��"+octaValue);
		System.out.println("16ת��Ϊʮ��������Ϊ��"+hexValue);
		//Long��ķ���
		System.out.println(Long.MAX_VALUE+"\n"+Long.MAX_VALUE);
		long long_value=Long.parseLong("4466");
		System.out.println(long_value);
		binaryValue=Long.toBinaryString(16);
		hexValue=Long.toHexString(16);
		octaValue=Long.toOctalString(16);
		System.out.println("16ת��Ϊ�����ƣ�"+binaryValue);
		System.out.println("16ת��Ϊʮ����������"+hexValue);
	    System.out.println("16ת��Ϊ�˽�������"+octaValue);	
	    //float���͵ĳ��÷���
	    System.out.println(Float.MAX_VALUE+"\n"+Float.MAX_VALUE);
	    hexValue=Float.toHexString(16);
		System.out.println("16ת��Ϊʮ����������"+hexValue);
	}

}
