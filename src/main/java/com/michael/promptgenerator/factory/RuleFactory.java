package com.michael.promptgenerator.factory;

import com.michael.promptgenerator.Enum.Purpose;
import com.michael.promptgenerator.dto.PromptRequestDto;
import com.michael.promptgenerator.rules.AbstractRule;
import com.michael.promptgenerator.rules.CommonRule;
import com.michael.promptgenerator.rules.InferringRule;
import com.michael.promptgenerator.rules.SummarizingRule;

public class RuleFactory {

    public static AbstractRule getRule(Purpose purpose, PromptRequestDto requestDto){
        return switch (purpose) {
            case COMMON -> new CommonRule(requestDto);
            case SUMMARIZING -> new SummarizingRule(requestDto);
            case INFERRING -> new InferringRule(requestDto);
        };
    }
}
