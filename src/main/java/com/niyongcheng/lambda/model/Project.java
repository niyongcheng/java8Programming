package com.niyongcheng.lambda.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class Project {
    private String name;
    private Integer star;
}
