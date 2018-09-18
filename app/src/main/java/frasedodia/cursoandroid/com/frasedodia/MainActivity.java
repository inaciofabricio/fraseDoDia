package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
                                "Como chamavam o Renato Russo antes de 1991? Renato Soviético?",
                                "Vivendo, aprendendo e morrendo sem saber de nada.",
                                "Gosta de chamar de ladrão, logo eu, político.",
                                "Ninguém conhece minhas lutas. Portanto, eu não preciso provar nada, a não ser sapatos, vestidos, comida e cachaça!",
                                "Se a vida me derrubar, vou aproveitar que estou no chão e vou tirar um cochilo."
                              };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {

            int numeroAleatorio = 0;
            int x = 0;

            @Override
            public void onClick(View v) {

                Random random = new Random();

                x = random.nextInt(frases.length);

                while(numeroAleatorio == x){

                    x = random.nextInt(frases.length);
                }

                numeroAleatorio = x;

                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });
    }
}
