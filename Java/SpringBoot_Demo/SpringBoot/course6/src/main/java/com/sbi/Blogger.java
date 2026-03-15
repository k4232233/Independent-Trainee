package com.sbi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Blogger {
    private Long id;
    private String name;
    private String pass;
}
