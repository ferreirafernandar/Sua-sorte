package suasorte.projeto.com.suasorte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoSuaSorte;
    private Button botaoSuaSorte;
    private String[] frases =   {
                                    "Pague o lanche",
                                    "Pague dois lanches",
                                    "Fique em silêncio por meia hora",
                                    "Diga que ama a Fernanda",
                                    "Não chegue atrasada amanhã",
                                    "Sabe a garrafa da Minnie? Joga fora!",
                                    "Pede um aumento"
                                };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoSuaSorte = (TextView) findViewById(R.id.textoSuaSorteId);
        botaoSuaSorte = (Button) findViewById(R.id.botaoSuaSorteId);

        botaoSuaSorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();

                int numeroAleatorio = randomico.nextInt(frases.length);
                textoSuaSorte.setText(frases[numeroAleatorio]);
            }
        });
    }
}
