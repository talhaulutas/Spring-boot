package com.example.demo.DataTransferObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserResult {

    @JsonProperty("Id")
    Long id;

    @JsonProperty("Name")
    String name;
}
