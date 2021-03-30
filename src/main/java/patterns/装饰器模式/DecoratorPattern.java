package patterns.装饰器模式;

/**
 * 装饰模式
 * <p>
 * Created by WangSai on 2021/3/30
 */
public class DecoratorPattern {

    // 抽象组件类
    public abstract class Component {
        public abstract void display();
    }

    // 具体组件类: 窗体类
    public class Window extends Component {

        @Override
        public void display() {
            System.out.println("display Window.");
        }
    }

    // 具体组件类：文本框类
    public class TextBox extends Component {

        @Override
        public void display() {
            System.out.println("display TextBox.");
        }
    }

    // 具体组件类：列表框
    public class ListBox extends Component {

        @Override
        public void display() {
            System.out.println("display ListBox.");
        }
    }

    // 抽象装饰类
    public class ComponentDecorator extends Component {
        // 引用抽象组件类
        private final Component component;

        // 传入抽象组件对象
        public ComponentDecorator(Component component) {
            this.component = component;
        }

        @Override
        public void display() {
            this.component.display();
        }
    }

    // 具体装饰类: 滚动条装饰类
    public class ScrollBarDecorator extends ComponentDecorator {

        public ScrollBarDecorator(Component component) {
            super(component);
        }

        @Override
        public void display() {
            this.setScrollBar();
            super.display();
        }

        private void setScrollBar() {
            System.out.println("添加ScrollBar");
        }
    }

    // 具体装饰类：黑色边框装饰类
    public class BlackBoarderDecorator extends ComponentDecorator {
        public BlackBoarderDecorator(Component component) {
            super(component);
        }

        @Override
        public void display() {
            this.setBlackBoarder();
            super.display();
        }

        private void setBlackBoarder() {
            System.out.println("添加BlackBoarder");
        }
    }


    public static void main(String[] args) {
        DecoratorPattern p = new DecoratorPattern();

        Component window = p.new Window();
        Component scrollBarWindow = p.new ScrollBarDecorator(window);
        scrollBarWindow.display();

        Component listBox = p.new ListBox();
        Component scrollBarWithBlackBoarder = p.new ScrollBarDecorator(p.new BlackBoarderDecorator(listBox));
        scrollBarWithBlackBoarder.display();


    }










}
