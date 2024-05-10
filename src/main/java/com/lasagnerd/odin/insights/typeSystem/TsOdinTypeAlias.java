package com.lasagnerd.odin.insights.typeSystem;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TsOdinTypeAlias extends TsOdinType {
    boolean distinct;
    TsOdinType aliasedType;
}
