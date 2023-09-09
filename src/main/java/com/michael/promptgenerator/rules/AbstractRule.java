package com.michael.promptgenerator.rules;

import com.michael.promptgenerator.config.Config;
import com.michael.promptgenerator.dto.PromptRequestDto;
import com.michael.promptgenerator.util.CommonUtil;
import com.michael.promptgenerator.util.ConfigUtil;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public abstract class AbstractRule {
    private PromptRequestDto requestDto;

    public AbstractRule(PromptRequestDto requestDto) {
        this.requestDto = requestDto;
    }

    public String execute(){
        Config config = requestDto.getConfig();
        StringBuilder sb = new StringBuilder();
        sb
                .append(ConfigUtil.getConfigPrompt(config))
                .append(getStringBeforeInstruction())
                .append(getInstruction())
                .append(getStringAfterInstruction())
                .append("\n")
                .append(CommonUtil.getContext(config.getDelimiter(), requestDto.getContext()))
        ;
        return sb.toString();
    }

    abstract String getInstruction();

    abstract String getStringBeforeInstruction();
    abstract String getStringAfterInstruction();

}
