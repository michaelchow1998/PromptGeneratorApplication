package com.michael.promptgenerator.util;

import com.michael.promptgenerator.Enum.Language;
import com.michael.promptgenerator.config.CommonConfig;

public class ConfigUtil {

    public static String getConfigPrompt(CommonConfig config){
            StringBuilder sb = new StringBuilder();
            sb.append(getLanguagePrompt(config.getLanguage()));
            sb.append(getOutPutFormat(config.getOutputFormat()));
            return sb.toString();
    }

    private static String getLanguagePrompt(Language language){
        if(language.equals(Language.EN)){
            return "If the result format not json, the result output language are english \n";
        }
        if(language.equals(Language.CH)){
            return "If the result format not json, the result output language are 繁體 \n";
        }
        return "";
    }

    private static String getOutPutFormat(String format){
        return "\nThe result format please use " + format +" format";

    }
}
