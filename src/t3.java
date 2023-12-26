public class t3 {
    public static String findLongestString(String[] array) {
        String longestString = "";
        for (String str : array) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        return longestString;
    }

    public static void main(String[] args) {
        String[] stringsArray = {"Строка 1", "Стрк 2", "оа 3", "Срк 3", "Тоа 4"};
        String result = findLongestString(stringsArray);
        System.out.println("Самая длинная строка: " + result);
    }
}