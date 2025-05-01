package com.example.demo.DataTransferObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserResult {

    @JsonProperty("Id")
    Long id;

    @JsonProperty("Name")
    String name;
}
