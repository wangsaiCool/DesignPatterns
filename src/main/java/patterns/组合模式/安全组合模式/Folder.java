package patterns.组合模式.安全组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangSai on 2021/4/21
 */
public class Folder implements AbstractFile {

    private final String name;
    private List<AbstractFile> list = new ArrayList<AbstractFile>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        list.add(file);
    }

    public void remove(AbstractFile file) {
        list.remove(file);
    }

    public AbstractFile getChild(int i) {
        return list.get(i);
    }

    public void killVirus() {
        System.out.printf("== 对文件夹'{%s}'进行杀毒\n", this.name);
        for (AbstractFile file : list) {
            file.killVirus();
        }
    }
}
