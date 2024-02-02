public class StringsPractice {
    // PRACTICE 1
    public void printBackward(String i) {
        int j = i.length();
        if (j == 0) return;
        for (int k = j - 1; k >= 0; k--) {
            System.out.print(i.charAt(k));
        }
    }

    // PRACTICE 2
    public boolean isPalindrome(String str) {
        String fw = str.toLowerCase();
        String bw = "";
        int j = str.length();
        for (int k = j - 1; k >= 0; k--) {
            bw += str.charAt(k);
        }
        bw = bw.toLowerCase();
        if (fw.equals(bw)) return true;
        else return false;
    }

    // TEST PRACTICE
    public String pigLatin (String str) {
        if(str.indexOf("a") == 0 || str.indexOf("e") == 0 || str.indexOf("i") == 0 || str.indexOf("o") == 0 || str.indexOf("u") == 0) {
            return str + "way";
        }
        else if (str.indexOf("a") == 1 || str.indexOf("e") == 1 || str.indexOf("i") == 1 || str.indexOf("o") == 1 || str.indexOf("u") == 1) {
            return str.substring(1) + str.charAt(0) + "ay";
        }
        else return str.substring(2) + str.substring(0,2) + "ay";
    }

    public static void main(String[] args) {
        StringsPractice cs = new StringsPractice();
        System.out.println("\nprintBackward");
        cs.printBackward("hello there!");
        System.out.println();
        System.out.println("\nisPalindrome");
        System.out.println(cs.isPalindrome("Vaanathi"));
        System.out.println(cs.isPalindrome("Racecar"));
        System.out.println();
        System.out.println("\npigLatin");
        System.out.println(cs.pigLatin("apple"));
        System.out.println(cs.pigLatin("dance"));
        System.out.println(cs.pigLatin("train"));
}
}