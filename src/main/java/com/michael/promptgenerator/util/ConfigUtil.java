package com.michael.promptgenerator.util;

import com.michael.promptgenerator.Enum.Language;
import com.michael.promptgenerator.config.Config;

public class ConfigUtil {

    public static String getConfigPrompt(Config config){
            StringBuilder sb = new StringBuilder();
            sb.append(getLanguage(config.getLanguage()));
            sb.append(getOutPutFormat(config.getOutputFormat()));
            sb.append(getComputerLanguage(config.getComputerLanguage()));
            return sb.toString();
    }

    private static String getLanguage(Language language){
        if(language.equals(Language.EN)){
            return "If the result format not json, the result output language are english";
        }
        if(language.equals(Language.CH)){
            return "If the result format not json, the result output language are 繁體";
        }
        return "";
    }

    private static String getOutPutFormat(String format){
        return "\nThe result format please use " + format +" format \n";
    }

    private static String getComputerLanguage(String computerLanguage){
        if(computerLanguage.isEmpty()){
            return "";
        }
        return "\nThe answer language please base on " + computerLanguage;
    }

}
