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
                //判断是否是文件对象  
                if(f.isFile()) {  
//                    if(f.getName().endsWith(".java")) {  
                        System.out.println(f.getName());  
//                    }  
                }  
                else if(f.isDirectory()){  
                    //是一个目录对象  
                	System.out.println(f.getName());
                    method(f);  
                }  
            }  
        }  
    }  
      
      
    //输出指定目录下的所有java文件名（不包含子目录）  
    public static void method2(File file) {  
        if(file.isDirectory()) {  
            File[] files = file.listFiles();  
            for (File f : files) {  
                //判断是否是文件对象  
                if(f.isFile()) {  
                    if(f.getName().endsWith(".java")) {  
                        System.out.println(f.getName());  
                    }  
                }  
            }  
        }  
    }  
      
}  
