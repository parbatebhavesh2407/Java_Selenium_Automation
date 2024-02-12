package ProgramTasks;

public class OddVowels {

    public static void main(String[] args) {
        String m = "Aeroplane";
        char[] ch = m.toCharArray();
        int count = 0;
        for (int i = 0; i < m.length(); i++) {
            if (i % 2 != 0) {
                System.out.println(ch[i]);
                if (m.charAt(i) == 'a' || m.charAt(i) == 'e' || m.charAt(i) == 'i' || m.charAt(i) == 'o' || m.charAt(i) == 'u') {
                    count++;
                }
            }
        }
        System.out.println("Vowels present at Odd Index:" + count);
    }
}
