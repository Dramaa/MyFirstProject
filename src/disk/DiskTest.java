package disk;
//遍历一个盘符而不是文件夹
//更新：先判断再执行
import java.io.Console;
import java.io.File;

public class DiskTest {
    public static void main(String[] args) {
        File file = new File("D:\\");


        if (file.exists()) { // 判断路径是否存在

            if(file.isDirectory()){   //是文件夹
                DirectoryTest.getAllFilePath(file);
            }else if(file.isFile()){     //是文件
                System.out.println("这是一个文件，你可以下载他");
            }
        }else{
            System.out.print("路径不存在！");

        }
    }


}
