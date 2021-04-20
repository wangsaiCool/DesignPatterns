package patterns.组合模式.安全组合模式;

/**
 * Created by WangSai on 2021/4/21
 */
public class VideoFile implements AbstractFile {
    private final String name;

    public VideoFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.printf("模拟杀毒，对视频文件'{%s}'进行杀毒\n", this.name);
    }
}
