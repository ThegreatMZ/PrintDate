/**

*@author LM

*@file:PrintDate.java

*@package: PrintDate

*@project: PrintDate

*@date time:2017��11��14������10:27:36

*@location: https://github.com/ThegreatMZ/PrintDate.git

 */
import java.util.Scanner;  
import java.util.Date;  
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
public class StrToDate {  
    //����ַ���������  
    private char []arrays;  
    String str;  
    public void Convert(){  
        Scanner input=new Scanner(System.in);  
        System.out.println("--------------------------------------------------------");  
        System.out.println("-����������ַ�������ʮλ�����ܼ�����                 ");  
        System.out.println("-����xxxx/xx/xx��ʽ�����׳���ʽ�쳣                     ");  
        System.out.println("-��������ġ�x���������ַ������׳������쳣              ");  
  
        System.out.println("��ѡ������Ҫ������  1 ���ϵͳʱ��  2 �Ӽ�������ʱ�䣨��ʽ����Ϊxxxx/xx/xx��ʽ��:");  
        int xuanze=input.nextInt();  
        if(xuanze==1){  
            printSystemTime();  
        }else if(xuanze==2){  
  
            System.out.println("-�����������ַ���(��ʽΪxxxx/xx/xx):                    ");  
            str=input.next();  
            arrays=str.toCharArray();  
            try{  
                //��������е�4�͵�7���ַ�Ϊ��/��  
                setForm(str);  
                //��������е�0��1��2��3��5��6��8��9���ַ�Ϊ�����ַ�  
                setNumber(str);  
                System.out.println("-��ѡ�������ʽ 1 Ϊxxxx/xx/xx��ʽ  2 Ϊxxxx-xx-xx��ʽ: ");  
                int geshi=input.nextInt();  
                switch(geshi){  
                case 1:form1();break;  
                case 2:form2();break;  
                default:  
                    System.out.println("��ʽ��־�������");  
                }  
            }  
            //�׳��쳣  
            catch(NumberException e){  
                System.out.println(e.toString());  
            }  
            //�׳��쳣  
            catch(MyException e){  
                System.out.println(e.toString());  
            }  
       }else{  
            System.out.println("��������뿴������ʾ");  
        }  
  
  
    }  
    public void setForm(String str) throws MyException{  
        //�Ը�ʽ���м��  
        if(arrays[4]!='/'||arrays[7]!='/'){  
            throw new MyException(str);  
        }  
    }  
    public void setNumber(String str) throws NumberException{  
        //�����ֽ��м��  
        if((arrays[0]&arrays[1]&arrays[2]&arrays[3]&arrays[5]&arrays[6]&arrays[8]&arrays[9])<48||(arrays[0]&arrays[1]&arrays[2]&arrays[3]&arrays[5]&arrays[6]&arrays[8]&arrays[9])>57){  
            throw new NumberException(str);  
        }  
    }  
    private void form1(){  
        Date date=new Date();  
        //ʵ�����ڵĸ�ʽ��  
        SimpleDateFormat form=new SimpleDateFormat("����Ϊ:"+str);  
        String timePattern=form.format(date);  
        System.out.println(timePattern);  
    }  
    private void form2(){  
        Date date=new Date();  
        //�������ַ�����ġ�/��ȫ��ת���ɡ�-��  
        String str1=str.replaceAll("/", "-");   
        //ʵ�����ڵĸ�ʽ��  
        SimpleDateFormat form=new SimpleDateFormat("����Ϊ:"+str1);  
        String timePattern=form.format(date);  
        System.out.println(timePattern);  
    }  
    private void printSystemTime(){  
        Date date=new Date();  
        //ʵ�����ڵĸ�ʽ��  
        SimpleDateFormat form=new SimpleDateFormat("'����Ϊ:'y��M��d��");  
        String timePattern=form.format(date);  
        System.out.println(timePattern);  
    }  
    private void form3(){  
        Date date=new Date();  
        //ʵ�����ڵĸ�ʽ��  
        SimpleDateFormat form=new SimpleDateFormat("'����Ϊ:'yyyy��MMMd��E");  
        try{  
            date=form.parse(str);  
        }catch(ParseException e){  
            e.printStackTrace();  
        }  
        System.out.println(date);  
    }  
}  
