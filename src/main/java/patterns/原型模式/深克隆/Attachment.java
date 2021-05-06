package patterns.原型模式.深克隆;

import java.io.Serializable;

/**
 * Created by WangSai on 2021/5/6
 */
public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
