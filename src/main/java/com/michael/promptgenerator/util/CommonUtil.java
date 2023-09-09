package com.michael.promptgenerator.util;

public class CommonUtil {

    public static String getContext(String delimiter, String context){
        if(!context.isEmpty()){
            return "\n" + delimiter + " " + context + " " + delimiter;

        }
        return "";
    }
}
