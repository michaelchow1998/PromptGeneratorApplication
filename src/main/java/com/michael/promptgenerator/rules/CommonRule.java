package com.michael.promptgenerator.rules;

import com.michael.promptgenerator.config.CommonConfig;
import com.michael.promptgenerator.util.CommonUtil;
import com.michael.promptgenerator.util.ConfigUtil;
import com.michael.promptgenerator.dto.PromptRequestDto;

public class CommonRule implements Rule{

    @Override
    public String execute(PromptRequestDto requestDto) {
        CommonConfig config = requestDto.getConfig();
        StringBuilder sb = new StringBuilder();
        sb
                .append(ConfigUtil.getConfigPrompt(config))
                .append("\n\n")
                .append(requestDto.getInstruction())
                .append(CommonUtil.getContext(config.getDelimiter(), requestDto.getContext()))
        ;
        return sb.toString();
    }

}
