package com.michael.promptgenerator.rules;

import com.michael.promptgenerator.dto.PromptRequestDto;

public interface Rule {

    String execute(PromptRequestDto requestDto);

}


