import java.io.File;
import java.util.Scanner;

public class A3 {  
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String src = scan.next();//eg.D:\\
        File f = new File(src);
        method(f);  
    }  
      
    public static void method(File file) {  
        if(file.isDirectory()) {  
            File[] files = file.listFiles();  
            for (File f : files) {  
                //�ж��Ƿ����ļ�����  
                if(f.isFile()) {  
//                    if(f.getName().endsWith(".java")) {  
                        System.out.println(f.getName());  
//                    }  
                }  
                else if(f.isDirectory()){  
                    //��һ��Ŀ¼����  
                	System.out.println(f.getName());
                    method(f);  
                }  
            }  
        }  
    }  
      
      
    //���ָ��Ŀ¼�µ�����java�ļ�������������Ŀ¼��  
    public static void method2(File file) {  
        if(file.isDirectory()) {  
            File[] files = file.listFiles();  
            for (File f : files) {  
                //�ж��Ƿ����ļ�����  
                if(f.isFile()) {  
                    if(f.getName().endsWith(".java")) {  
                        System.out.println(f.getName());  
                    }  
                }  
            }  
        }  
    }  
      
}  
