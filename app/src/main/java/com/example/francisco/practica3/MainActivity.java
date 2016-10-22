package com.example.francisco.practica3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtxtNum;
    private TextView txtINum, txtHoras, txtMin, txtSeg, txtDecSeg;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtxtNum = (EditText)findViewById(R.id.edtxt1);
        txtINum = (TextView) findViewById(R.id.txtV1);
        txtHoras = (TextView)findViewById(R.id.txtV2);
        txtMin = (TextView)findViewById(R.id.txtV3);
        txtSeg = (TextView)findViewById(R.id.txtV4);
        txtDecSeg = (TextView)findViewById(R.id.txtV5);
        btnCalcular = (Button)findViewById(R.id.btn1);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hora, min, seg, decSeg;
                String num = edtxtNum.getText().toString();
                double numConv = Double.parseDouble(num);
                hora = (int)(numConv);
                numConv = (numConv-hora)*60;
                min = (int)(numConv);
                numConv = (numConv-min)*60;
                seg = (int)(numConv);
                numConv = (numConv-seg)*60;
                decSeg = (int)(numConv);
               String res = "El total de horas es: "+hora+"\n";
                String res1 = "El total de minutos es "+min+ "\n";
                String res2 = "El total de segundos es "+seg+ "\n";
                String res3 = "El total de decimas de segundo es "+decSeg+ "\n";


                txtHoras.setText(res);
                txtMin.setText(res1);
                txtSeg.setText(res2);
                txtDecSeg.setText(res3);




            }

        });
    }
}
