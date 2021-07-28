package 后端.Java常用设计模式.责任链模式;

/**
 * Created by SachsFang on 2021/7/16 15:44
 */
public class DebugLogger extends AbstractLogger {

    DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void printMessage(String message) {
        System.out.println("DebuggerLogger:" + message);
    }
}
