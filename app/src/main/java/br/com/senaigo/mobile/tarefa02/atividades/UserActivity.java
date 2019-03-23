package br.com.senaigo.mobile.tarefa02.atividades;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.com.senaigo.mobile.tarefa02.R;
import br.com.senaigo.mobile.tarefa02.models.User;
import br.com.senaigo.mobile.tarefa02.config.RetrofitConfig;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        final EditText txtIdUser = findViewById(R.id.txt_id_user);
        final TextView respostaIdUser = findViewById(R.id.resposta_id_user);
        Button btnBuscarUser = findViewById(R.id.btn_buscar_user);
        btnBuscarUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Call<User> call = new RetrofitConfig().getUserService().getUser(respostaIdUser.getText().toString());
                call.enqueue(new Callback<User>() {

                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        User user = response.body();
                        Toast.makeText(UserActivity.this, "Objeto User = " + user.getName(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Log.e("UserServico   ", "Erro na do busca do user: " + call + "Erro = " + t.getMessage());
                    }
                });

            }
        });


    }

}
