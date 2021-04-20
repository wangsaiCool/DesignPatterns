package patterns.组合模式.透明组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangSai on 2021/4/20
 */
public class Folder extends AbstractFile{
    private final List<AbstractFile> list = new ArrayList<AbstractFile>();
    private final String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile abstractFile) {
        list.add(abstractFile);
    }

    public void remove(AbstractFile abstractFile) {
        list.remove(abstractFile);
    }

    public AbstractFile getChild(int i) {
        return list.get(i);
    }

    public void killVirus() {
        System.out.printf("** 对文件夹'{%s}'进行杀毒.\n", this.name);
        for (AbstractFile file : list) {
            file.killVirus();
        }
    }
}
