package internship;

public class Main {
    public static void main(String[] args) {
        System.out.println(interviewRecursionTest("hello")); // Output: h*e*ll*o
        System.out.println(interviewRecursionTest("healo")); // Output: h*e*a*l*o
        System.out.println(interviewRecursionTest("abc")); // Output: a*bc
        System.out.println(interviewRecursionTest("oab")); // Output: o*a*b
    }

    public static String interviewRecursionTest(String line) {
        if (line.length() <= 1) {
            return line;
        } else {
            String firstChar = line.substring(0, 1);
            String restOfString = line.substring(1);

            String separator = (isVowel(firstChar)
                    || isVowel(restOfString.substring(0, 1))) ? "*" : "";
            return firstChar + separator + interviewRecursionTest(restOfString);
        }
    }

    private static boolean isVowel(String c) {
        return "aeiouAEIOU".contains(c);
    }
}
