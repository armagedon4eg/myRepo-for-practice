package com.razno;

public class   ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        rs.reverseString(new char []{'a','b','c','d','e'});
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
