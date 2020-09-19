package disk;
//遍历一个文件夹
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryTest {
//    public static void main(String[] args) {
//        File file = new File("D:\\apache-maven-3.3.9");
//        File[] files=file.listFiles();
//        for(int i=0;i<files.length;i++){
//            System.out.println(files[i].getPath());
//        }
       // getAllFilePath(file);

//    }

//    public static void getAllFilePath(File file) {
//        File[] files=file.listFiles();
//        for(int i=0;i<files.length;i++){
//            if(files[i].isDirectory()){
//                System.out.println(files[i].getPath());
//                //这里面用了递归的算法 
//                //getAllFilePath(files[i]);
//                //注释掉上面两行表示只遍历子文件，而不是所有文件
//            } else {
//                System.out.println(files[i].getPath());
//            }
//        }
//    }
    public static List<String> getAllFilePath(File file) {
        List<String> DAFlist=new ArrayList<String>();
        File[] files=file.listFiles();
        for(int i=0;i<files.length;i++){
                String Path=files[i].getPath();
                String TheLastOfPath=splitTheLast.lastName(Path);
                DAFlist.add(TheLastOfPath);

        }
        return DAFlist;
    }

    public static List<String> getAllFilePath2(File file) {
        List<String> DAFlist2=new ArrayList<String>();
        File[] files=file.listFiles();
        for(int i=0;i<files.length;i++){
                String Path=files[i].getPath();
                DAFlist2.add(Path);

        }
        return DAFlist2;
    }


}
