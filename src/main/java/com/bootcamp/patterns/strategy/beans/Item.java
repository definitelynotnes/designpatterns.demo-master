package com.bootcamp.patterns.strategy.beans;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Item {
    private String code;
    private float price;
}
