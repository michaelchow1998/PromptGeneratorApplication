package com.michael.promptgenerator.service;

import com.michael.promptgenerator.dto.PromptRequestDto;
import com.michael.promptgenerator.rules.Rule;
import com.michael.promptgenerator.factory.RuleFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PromptGeneratorService {

    public String getPrompt(PromptRequestDto requestDto){
        Rule rule = RuleFactory.getRule(requestDto.getPurpose());
        String prompt = rule.execute(requestDto);
        return prompt;
    }
}
