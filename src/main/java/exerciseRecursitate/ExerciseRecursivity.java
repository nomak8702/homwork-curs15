package exerciseRecursitate;

public class ExerciseRecursivity {

    public int sumFirst(int n) {

        return n == 0 ? 0 : sumFirst((n - 1)) + n;
    }

    public int sumEven(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 2 != 0 ? n : sumEven(n - 1) + n;
        }
    }

    public String stringRevers(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        } else {
            char lastChar = word.charAt(word.length() - 1);
            String rest = word.substring(0, word.length() - 1);
            return lastChar + stringRevers(rest);
        }
    }

    public String checkLastCharFirst(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        } else {
            char lastChar = word.charAt(word.length() - 1);
            String firstChar = word.substring(0, 1);
            return stringRevers(firstChar) + " " + lastChar;
        }
    }

    public int sumDigit(int n) {

        return n == 0 ? 0 : n % 10 + sumDigit(n / 10);
    }
}
