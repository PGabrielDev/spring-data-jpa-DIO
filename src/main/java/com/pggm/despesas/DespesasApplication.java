package com.pggm.despesas;

import com.pggm.despesas.persistence.repository.CategoryRepository;
import com.pggm.despesas.services.GetAllCategoriesUseCase;
import com.pggm.despesas.services.interfaces.IGetAllCategoriesUseCase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DespesasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DespesasApplication.class, args);
	}



}
