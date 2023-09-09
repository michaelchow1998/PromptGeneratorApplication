package com.michael.promptgenerator.rules;

import com.michael.promptgenerator.config.CommonConfig;
import com.michael.promptgenerator.dto.PromptRequestDto;
import com.michael.promptgenerator.util.CommonUtil;
import com.michael.promptgenerator.util.ConfigUtil;

public class SummarizingRule implements Rule{

    @Override
    public String execute(PromptRequestDto requestDto) {
        CommonConfig config = requestDto.getConfig();
        StringBuilder sb = new StringBuilder();
        sb
                .append(ConfigUtil.getConfigPrompt(config))
                .append("\n\n")
                .append(getCompleteInstruction(requestDto.getInstruction()))
                .append("\n")
                .append(CommonUtil.getContext(config.getDelimiter(), requestDto.getContext()))
        ;
        return sb.toString();
    }

    private String getCompleteInstruction(String instruction){
        String tempInstruction = "";
        if(!instruction.isEmpty()){
            tempInstruction = " \nplease focus on " + instruction;
        }

        return (
                "Your task is to generate a short summary of the context" +
                "\n" +
                "Summarize the review below, delimited by triple backticks \n" + tempInstruction
        );

    }
}
