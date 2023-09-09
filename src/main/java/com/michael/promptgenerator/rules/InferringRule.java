package com.michael.promptgenerator.rules;

import com.michael.promptgenerator.dto.PromptRequestDto;

public class InferringRule extends AbstractRule {

    private PromptRequestDto requestDto;

    public InferringRule(PromptRequestDto requestDto) {
        super(requestDto);
    }

    @Override
    String getInstruction() {
        String instruction = this.getRequestDto().getInstruction();

        return (
                "\n" + instruction +"of the following context\n" +
                        "which is delimited with triple backticks?"
        );
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