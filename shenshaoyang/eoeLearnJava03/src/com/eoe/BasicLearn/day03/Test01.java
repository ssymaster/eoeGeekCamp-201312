package com.eoe.BasicLearn.day03;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Byte��ĳ��÷����ͳ���
				System.out.println("byte������������"+Math.pow(2, 8));
				System.out.println("byte��ȡֵ��Χ��"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
				byte bMax=Byte.parseByte("127");
				System.out.println(bMax);
				
				//Short��ĳ��÷����ͳ���
				System.out.println("short������������"+Math.pow(2, 16));
				System.out.println("short��ȡֵ��Χ��"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
				short shortValue=Short.parseShort("1000");
				System.out.println(shortValue);
				
				//Integer��ĳ��÷����ͳ���
				System.out.println("int������������"+Math.pow(2, 32));
				System.out.println("int��ȡֵ��Χ��"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
				int intValue=Integer.parseInt("2000000");
				System.out.println(intValue);
				String binaryValue=Integer.toBinaryString(16);
				String hexValue=Integer.toHexString(16);
				String octalValue=Integer.toOctalString(16);
				System.out.println("16ת��Ϊ�����ƣ�"+binaryValue);
				System.out.println("16ת��Ϊʮ����������"+hexValue);
				System.out.println("16ת��Ϊ�˽�������"+octalValue);
				
				//Long��ĳ��÷����ͳ���
				System.out.println("long������������"+Math.pow(2, 64));
				System.out.println("long��ȡֵ��Χ��"+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
				long longValue=Long.parseLong("2000000");
				System.out.println(intValue);
				binaryValue=Long.toBinaryString(16);
				hexValue=Long.toHexString(16);
				octalValue=Long.toOctalString(16);
				System.out.println("16ת��Ϊ�����ƣ�"+binaryValue);
				System.out.println("16ת��Ϊʮ����������"+hexValue);
				System.out.println("16ת��Ϊ�˽�������"+octalValue);
				//Float��ĳ��÷����ͳ���
				
				System.out.println("float������������"+Math.pow(2, 32));
				System.out.println("float��ȡֵ��Χ��"+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
				float floatValue=Long.parseLong("2000000");
				System.out.println(floatValue);
				hexValue=Float.toHexString(16);
				System.out.println("16ת��Ϊʮ����������"+hexValue);
				
				//Double��ĳ��÷����ͳ���
				System.out.println("double������������"+Math.pow(2, 64));
				System.out.println("double��ȡֵ��Χ��"+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
				double doubleValue=Long.parseLong("2000000");
				System.out.println(doubleValue);
				binaryValue=Long.toBinaryString(16);
				hexValue=Long.toHexString(16);
				octalValue=Long.toOctalString(16);
				System.out.println("16ת��Ϊ�����ƣ�"+binaryValue);
				System.out.println("16ת��Ϊʮ����������"+hexValue);
				System.out.println("16ת��Ϊ�˽�������"+octalValue);
				
	}

}
