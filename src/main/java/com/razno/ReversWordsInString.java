package com.razno;

public class ReversWordsInString {

    public static void main(String[] args) {
        ReversWordsInString reverseString = new ReversWordsInString();
        reverseString.reverseWords("Let's take LeetCode contest");

    }
    public String reverseWords(String s) {
        char [] charArr = s.toCharArray();
        int head= 0;
        int tail = 0;

        for (; tail < charArr.length; tail++) {
            if (charArr[tail] == ' '){
                reverse (charArr, head, tail-1);
                head = tail +1;
            }
        }
        reverse (charArr, head, tail-1);
        System.out.println(charArr);
        return new String(charArr);
    }

    public void reverse (char[] c, int head, int tail) {
        while (head < tail) {
            char temp = c[tail];
            c[tail] = c[head];
            c[head] = temp;
            head++;
            tail--;
        }
    }

    public void reverseString(char[] s) {
        int head;
        int tail;
        if (s.length % 2 == 0) {
            head = s.length/2 - 1;
            tail = s.length/2;
        } else {
            head = tail = s.length/2;
        }

        while (tail <= s.length-1) {
            char temp;
            temp = s[head];
            s[head] = s[tail];
            s[tail] = temp;
            head--;
            tail++;
        }

    }
}
