package com.briup.day08;
/**
 *run as
 *1.����main����Ϊmain������Test����
 *2.��Test������������
 *3.Test���ּ̳���Base��
 *4.ת��ȥ����Base��
 *�ڼ���Base���ʱ�򣬷��������о�̬����飬����������Base�еľ�̬�����
 * @author CLY
 *
 */
public class Test extends Base{
	 
    static{
        System.out.println("test static");
    }
     
    public Test(){
        System.out.println("test constructor");
    }
     
    public static void main(String[] args) {
        new Test();
    }
}
 
class Base{
     
    static{
        System.out.println("base static");
    }
     
    public Base(){
        System.out.println("base constructor");
    }
}
