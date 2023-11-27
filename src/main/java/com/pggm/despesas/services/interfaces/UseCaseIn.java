package com.pggm.despesas.services.interfaces;

public interface UseCaseIn<IN> {
    void execute(IN input) throws Exception;
}
