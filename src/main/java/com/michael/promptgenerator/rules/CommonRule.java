package com.michael.promptgenerator.rules;

import com.michael.promptgenerator.dto.PromptRequestDto;

public class CommonRule extends AbstractRule{

    private PromptRequestDto requestDto;

    public CommonRule(PromptRequestDto requestDto) {
       super(requestDto);
    }

    @Override
    String getInstruction() {
        return this.getRequestDto().getInstruction();
    }

    @Override
    String getStringBeforeInstruction() {
        return "";
    }

    @Override
    String getStringAfterInstruction() {
        return "";
    }


}
