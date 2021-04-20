package patterns.组合模式.安全组合模式;

/**
 * 安全组合模式
 * <p>
 * <p>
 * Created by WangSai on 2021/4/21
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractFile text1 = new TextFile("密码.txt");
        AbstractFile text2 = new TextFile("账号.txt");
        Folder textFolder = new Folder("文本文件夹");
        textFolder.add(text1);
        textFolder.add(text2);

        AbstractFile video1 = new VideoFile("新年祝福.hevc");
        AbstractFile video2 = new VideoFile("烟花.hevc");
        Folder videoFolder = new Folder("视频文件夹");
        videoFolder.add(video1);
        videoFolder.add(video2);


        Folder rootFolder = new Folder("根目录");
        rootFolder.add(textFolder);
        rootFolder.add(videoFolder);


        rootFolder.killVirus();
    }
}
