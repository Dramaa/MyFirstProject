package disk;

import javax.swing.filechooser.FileSystemView;
import java.io.Console;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FirstTest {
    public static void main(String[] args) {
       // List<String> myroot=new ArrayList<String>();
        File[] roots = File.listRoots();
        FileSystemView sys = FileSystemView.getFileSystemView();
        for (int i = 0; i < roots.length; i++) {
            if(!sys.getSystemTypeDescription(roots[i]).equals("本地磁盘")){
                continue;
            }
            System.out.println(roots[i].getPath());
            //myroot.add(roots[i].getPath());
        }
    }
}
