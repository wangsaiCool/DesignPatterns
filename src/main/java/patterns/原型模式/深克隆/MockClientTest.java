package patterns.原型模式.深克隆;

import java.io.IOException;

/**
 * Created by WangSai on 2021/5/6
 */
public class MockClientTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WeeklyLog log = new WeeklyLog();
        Attachment attachment = new Attachment();
        log.setAttachment(attachment);
        log.setDate("2021年05月06日23:25:59");
        log.setName("牛年大吉");
        log.setSize(2048);

        WeeklyLog clone = log.deepClone();
        System.out.println("clone == log?:" + (clone == log));
        System.out.println("clone.getContent() == log.getContent()?:" + (clone.getDate() == log.getDate()));
        System.out.println("clone.getContent() == log.getContent()?:" + (clone.getName() == log.getName()));
        System.out.println("clone.getAttachment() == log.getAttachment()?:" + (clone.getAttachment() == log.getAttachment()));
        System.out.println("clone.getSize() == log.getSize()?:" + (clone.getSize() == log.getSize()));

    }
}
