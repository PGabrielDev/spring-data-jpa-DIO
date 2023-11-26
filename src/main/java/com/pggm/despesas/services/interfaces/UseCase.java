package com.pggm.despesas.services.interfaces;

public interface  UseCase<IN, OUT> {
    OUT execute(IN input);
}
