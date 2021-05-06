package patterns.原型模式.浅克隆;

/**
 * Created by WangSai on 2021/5/6
 */
public class WeeklyLog implements Cloneable {
    private Attachment attachment;
    private String name;
    private String date;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public WeeklyLog clone() {
        try {
            return (WeeklyLog) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持克隆");
            return null;
        }
    }
}
