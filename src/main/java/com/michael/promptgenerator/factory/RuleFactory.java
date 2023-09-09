package com.michael.promptgenerator.factory;

import com.michael.promptgenerator.Enum.Purpose;
import com.michael.promptgenerator.rules.CommonRule;
import com.michael.promptgenerator.rules.Rule;
import com.michael.promptgenerator.rules.SummarizingRule;

public class RuleFactory {

    public static Rule getRule(Purpose purpose){
        switch (purpose) {
            case COMMON:
                return new CommonRule();
            case SUMMARIZING:
                return new SummarizingRule();
            case INFERRING:
                return new CommonRule();
            case TRANSFORMING:
                return new CommonRule();
            case EXPANDING:
                return new CommonRule();
            case OTHERS:
                return new CommonRule();
        }
        return null;
    }
}
