package com.michael.promptgenerator;

import com.michael.promptgenerator.dto.PromptRequestDto;
import com.michael.promptgenerator.service.PromptGeneratorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
@Slf4j
public class PromptGeneratorController {

    private PromptGeneratorService service;

    @Autowired
    public PromptGeneratorController(PromptGeneratorService service) {
        this.service = service;
    }

    @PostMapping()
    public ResponseEntity<String> getPrompt(@RequestBody PromptRequestDto requestDto){
        String prompt = service.getPrompt(requestDto);
        System.out.println(prompt);
        return ResponseEntity.status(HttpStatus.OK).body(prompt);
    }
}
