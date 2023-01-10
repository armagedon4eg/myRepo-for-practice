package leetcode;

public class LongestCommonPrefix_14 {

    public String longestStringPref(String[] strings) {
        if (strings.length == 0) {
            return "";
        }
        String prefix = strings[0];
        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }
        System.out.println(prefix);
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix_14 lc14 = new LongestCommonPrefix_14();
        String[] strArr = new String [4];
        strArr[0] = "abcd";
        strArr[1] = "abpos";
        strArr[2] = "abxx";
        strArr[3] = "azr";
        lc14.longestStringPref(strArr);
        }
    }

