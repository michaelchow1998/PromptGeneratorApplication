package com.michael.promptgenerator.service;

import com.michael.promptgenerator.dto.PromptRequestDto;
import com.michael.promptgenerator.factory.RuleFactory;
import com.michael.promptgenerator.rules.AbstractRule;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PromptGeneratorService {

    public String getPrompt(PromptRequestDto requestDto){
        AbstractRule rule = RuleFactory.getRule(requestDto.getPurpose(), requestDto);
        String prompt = rule.execute();
        return prompt;
    }
}
