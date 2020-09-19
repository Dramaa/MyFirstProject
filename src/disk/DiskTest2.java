package disk;
//遍历一个盘符而不是文件夹
//更新：先判断再执行
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DiskTest2{
    public static List<String> Como(String Path) throws Exception {
        File file = new File(Path);
        List<String> tlist=new ArrayList<String>();
        if (file.exists()) { // 判断路径是否存在

            if(file.isDirectory()){
                //是文件夹
                  tlist=DirectoryTest.getAllFilePath(file);

            }else if(file.isFile()){     //是文件
                System.out.println("这是一个文件，你可以下载他");
                downLoad d=new downLoad();
                d.downloadLocal(d.download(file.getPath(),Comon2.resp));


            }
        }else{
            System.out.print("路径不存在！");
        }
        return tlist;
    }
    public static List<String> ComoPathList(String Path) throws Exception{
        File file = new File(Path);
        List<String> tlist2=new ArrayList<String>();
        if (file.exists()) { // 判断路径是否存在
                tlist2=DirectoryTest.getAllFilePath2(file);
        }
        return tlist2;
    }
    }



