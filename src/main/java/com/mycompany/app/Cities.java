package com.mycompany.app;

import com.amazonaws.services.lambda.runtime.Context;

public class Cities {

    public String getCountry() {
        String country = "Moldova";

        System.out.println(String.format("country: %s", country) );
    
        return country;
    }

    public class LambdaMethodHandler {
        public String handleRequest(String input, Context context) {
            context.getLogger().log("Input: " + input);
            return String.format("The country %s and the input %s", getCountry(),  input);
        }
    }
    
}
