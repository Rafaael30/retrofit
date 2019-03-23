package br.com.senaigo.mobile.tarefa02.config;

import br.com.senaigo.mobile.tarefa02.servicos.UserServico;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
       this.retrofit = new Retrofit.Builder()
               .baseUrl("https://jsonplaceholder.typicode.com/")
               .addConverterFactory(JacksonConverterFactory.create())
               .build();
    }

    public UserServico getUserService() {
        return this.retrofit.create(UserServico.class);
    }

}
