package com.example.algorithm;

import java.util.HashMap;

public class CompareString {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "def";

        String str4 = new String("wxy");
        String str5 = new String("zzz");
        String str6 = new String("zzz");


        System.out.println("str1 == str3 : = "+str1 == str3);
        System.out.println("str1 == str2 : = "+str1.equals(str2));
        System.out.println("str1 == str4 : = "+str1 == str4);

        System.out.println("str1.equal to str4 : = "+str1.equals(str4));
        System.out.println("str5.equalTo str6 : = "+str5.equals(str6));


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key1","value");
        hashMap.put("key2","value");


    }
}
