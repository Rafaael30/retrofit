package br.com.senaigo.mobile.tarefa02.servicos;

import br.com.senaigo.mobile.tarefa02.models.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserServico {

        @GET("users/{id}")
        Call<User> getUser(@Path("id") String id);

}
