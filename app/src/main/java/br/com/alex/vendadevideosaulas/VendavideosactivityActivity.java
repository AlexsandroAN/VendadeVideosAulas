package br.com.alex.vendadevideosaulas;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class VendavideosactivityActivity extends ActionBarActivity {

    // Criando as Variaveis
    CheckBox cbAlgoritimo, cbJava, cbAndroid, cbDelphi, cbPHP;
    Button btFinalizar;
    EditText etValorTotal;
    double valorTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vendavideosactivity);

        //Setando as Variaveis
        cbAlgoritimo = (CheckBox) findViewById(R.id.cbAlgoritimo);
        cbJava = (CheckBox) findViewById(R.id.cbJava);
        cbAndroid = (CheckBox) findViewById(R.id.cbAndroid);
        cbDelphi = (CheckBox) findViewById(R.id.cbDelphi);
        cbPHP = (CheckBox) findViewById(R.id.cbPHP);
        btFinalizar = (Button) findViewById(R.id.btFinalizar);
        etValorTotal = (EditText) findViewById(R.id.etValorTotal);

        //metodo para setar a soma das videos aulas
        btFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorTotal=0;

                if (cbAlgoritimo.isChecked())
                valorTotal += 99;

                if (cbJava.isChecked())
                    valorTotal += 1299;

                if (cbAndroid.isChecked())
                    valorTotal += 599;

                if (cbDelphi.isChecked())
                    valorTotal += 499;

                if (cbPHP.isChecked())
                    valorTotal += 399;

                etValorTotal.setText(String.valueOf(valorTotal));
                if (valorTotal > 500){
                    AlertDialog.Builder caixaAlerta =
                            new AlertDialog.Builder(VendavideosactivityActivity.this);
                        caixaAlerta.setMessage("Agradecemos pela Compra dos Videos do Alex, Você terá 10% de desconto");
                    caixaAlerta.setTitle("Alerta de Compra dos videos");
                    caixaAlerta.setNegativeButton("OK", null);
                    caixaAlerta.show();
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vendavideosactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
