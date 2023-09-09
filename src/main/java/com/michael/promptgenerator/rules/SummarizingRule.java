package com.michael.promptgenerator.rules;

import com.michael.promptgenerator.dto.PromptRequestDto;

public class SummarizingRule extends AbstractRule{

    public SummarizingRule(PromptRequestDto requestDto) {
        super(requestDto);
    }

    @Override
    String getInstruction() {
        String instruction = this.getRequestDto().getInstruction();
        String completeInstruction = "";
        if(!instruction.isEmpty()){
            completeInstruction = " \nplease focus on " + instruction;
        }

        return (
                "Your task is to generate a short summary of the context \n" +
                "Summarize the review below, delimited by triple backticks \n" +
                completeInstruction
        );
    }

    @Override
    String getStringBeforeInstruction() {
        return  "";
    }

    @Override
    String getStringAfterInstruction() {
        return  "";
    }

}
