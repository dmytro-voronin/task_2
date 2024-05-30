package internship;

public class Main {
    public static void main(String[] args) {
        System.out.println(interviewRecursionTest("hello")); // Output: h*e*ll*o
        System.out.println(interviewRecursionTest("healo")); // Output: h*e*a*l*o
        System.out.println(interviewRecursionTest("abc")); // Output: a*bc
        System.out.println(interviewRecursionTest("oab")); // Output: o*a*b
    }

    public static String interviewRecursionTest(String line) {
        if (line.isEmpty() || line.length() == 1) {
            return line;
        } else {
            char firstChar = line.charAt(0);
            char secondChar = line.charAt(1);

            if (isVowel(firstChar)) {
                return firstChar + "*" + interviewRecursionTest(line.substring(1));
            } else if (isVowel(secondChar)) {
                return firstChar + "*" + interviewRecursionTest(line.substring(1));
            } else {
                return firstChar + interviewRecursionTest(line.substring(1));
            }
        }
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
