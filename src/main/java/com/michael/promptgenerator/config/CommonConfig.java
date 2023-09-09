package com.michael.promptgenerator.config;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.michael.promptgenerator.Enum.Language;
import lombok.Data;

@Data
public class CommonConfig {

    private String delimiter = "'''";

    @JsonProperty("output_format")
    private String outputFormat = "text";

    private Language language = Language.EN;


}
