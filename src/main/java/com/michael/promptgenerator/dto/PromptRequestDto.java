package com.michael.promptgenerator.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.michael.promptgenerator.Enum.Purpose;
import com.michael.promptgenerator.config.Config;
import lombok.Data;


@Data
public class PromptRequestDto {

    private Purpose purpose = Purpose.COMMON;

    private String instruction ="";

    private String context = "";

    @JsonProperty("config")
    private Config config = new Config();

}
