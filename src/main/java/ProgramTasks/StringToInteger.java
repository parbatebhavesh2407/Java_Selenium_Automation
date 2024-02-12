package ProgramTasks;

public class StringToInteger {
    public static void main(String[] args) {
        String str = "122112";
        int num = Integer.parseInt(str);
        System.out.println("String To Integer: " + num);
        String st = Integer.toString(num);
        System.out.println("Integer To String: " + st);

    }
}
