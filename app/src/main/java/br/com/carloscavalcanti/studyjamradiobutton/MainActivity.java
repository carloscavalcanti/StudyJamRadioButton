package br.com.carloscavalcanti.studyjamradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton radioAzul, radioVermelho;
    TextView txtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTexto = (TextView) findViewById(R.id.txtTexto);

        radioAzul = (RadioButton) findViewById(R.id.radioAzul);
        radioAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTexto.setTextColor(getResources().getColor(R.color.azul));
            }
        });

        radioVermelho = (RadioButton) findViewById(R.id.radioVermelho);
        radioVermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTexto.setTextColor(getResources().getColor(R.color.vermelho));
            }
        });
    }
}
