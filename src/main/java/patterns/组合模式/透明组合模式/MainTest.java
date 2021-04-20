package patterns.组合模式.透明组合模式;

/**
 * 透明组合模式
 * <p>
 * Created by WangSai on 2021/4/20
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractFile image1 = new ImageFile("德玛西亚皇子.jpg");
        AbstractFile image2 = new ImageFile("皮城女警.jpg");
        AbstractFile imageFolder = new Folder("图片文件夹");
        imageFolder.add(image1);
        imageFolder.add(image2);

        AbstractFile video1 = new VideoFile("五杀录屏.mp4");
        AbstractFile video2 = new VideoFile("超神录屏.mp4");
        AbstractFile videoFolder = new Folder("视频文件夹");
        videoFolder.add(video1);
        videoFolder.add(video2);

        AbstractFile text1 = new TextFile("操作记录1.txt");
        AbstractFile text2 = new TextFile("操作记录2.txt");
        AbstractFile textFolder = new Folder("文本文件夹");
        textFolder.add(text1);
        textFolder.add(text2);

        AbstractFile rootFolder = new Folder("王赛的文件夹");
        rootFolder.add(imageFolder);
        rootFolder.add(videoFolder);
        rootFolder.add(textFolder);

        rootFolder.killVirus();

        videoFolder.killVirus();
    }
}
