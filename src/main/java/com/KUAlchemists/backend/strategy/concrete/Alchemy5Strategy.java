package com.KUAlchemists.backend.strategy.concrete;

import com.KUAlchemists.backend.enums.Aspect;
import com.KUAlchemists.backend.strategy.AlchemicalNamingStrategy;

public class Alchemy5Strategy implements AlchemicalNamingStrategy {
    @Override
    public String getAlchemicalName(Aspect red, Aspect green, Aspect blue) {
        return "alchemy5.png";
    }
}
