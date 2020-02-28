package com.example.convertidordepeso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class convertidorActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn_punto,btn_salir,btn_convertir,btn_borrar;
    private Button btn_dop1,btn_usd1,btn_eur1,btn_kwd1,btn_dop2,btn_usd2,btn_eur2,btn_kwd2;
    private TextView txt_total, txt_valor, txt_nomCompleto, nom,ape;
    private String dePesos, aPesos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertidor);
        txt_total = findViewById(R.id.txt_total);
        txt_valor = findViewById(R.id.txt_valor);
        txt_nomCompleto = findViewById(R.id.txt_nomcompleto);
        nom = findViewById(R.id.txt_nombre);
        ape = findViewById(R.id.txt_apellido);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btn_dop1 = findViewById(R.id.btn_dop1);
        btn_dop2 = findViewById(R.id.btn_dop2);
        btn_usd1 = findViewById(R.id.btn_usd1);
        btn_usd2 = findViewById(R.id.btn_usd2);
        btn_eur1 = findViewById(R.id.btn_eur1);
        btn_eur2 = findViewById(R.id.btn_eur2);
        btn_kwd1 = findViewById(R.id.btn_kwd1);
        btn_kwd2 = findViewById(R.id.btn_kwd2);
        btn_borrar = findViewById(R.id.btn_borrar);
        btn_punto = findViewById(R.id.btn_punto);
        btn_salir = findViewById(R.id.btn_salir);
        btn_convertir = findViewById(R.id.btn_convertir);


        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt_valor.setText(txt_valor.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                txt_valor.setText(txt_valor.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                txt_valor.setText(txt_valor.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                txt_valor.setText(txt_valor.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                txt_valor.setText(txt_valor.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                txt_valor.setText(txt_valor.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                txt_valor.setText(txt_valor.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                txt_valor.setText(txt_valor.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                txt_valor.setText(txt_valor.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                txt_valor.setText(txt_valor.getText() + "0");
            }
        });



        btn_convertir.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                DecimalFormat formato = new DecimalFormat();
                formato.setMaximumFractionDigits(4);

                switch (dePesos){

                    case "dop1":
                        if(aPesos == "dop2"){

                            txt_total.setText(txt_valor.getText().toString());

                        }else if(aPesos == "usd2"){

                            double valor = Double.parseDouble(txt_valor.getText().toString());
                            double total = valor / 53.38;
                            txt_total.setText(String.valueOf(formato.format(total)));

                        }else if(aPesos == "eur2"){

                            double valor = Double.parseDouble(txt_valor.getText().toString());
                            double total = valor / 59.22;
                            txt_total.setText(String.valueOf(formato.format(total)));

                        }else if(aPesos == "kwd2"){

                            double valor = Double.parseDouble(txt_valor.getText().toString());
                            double total = valor / 175.79;
                            txt_total.setText(String.valueOf(formato.format(total)));

                        }
                        break;

                    case "usd1":

                        if(aPesos == "dop2"){

                            double valor = Double.parseDouble(txt_valor.getText().toString());
                            double total = valor * 53.38;
                            txt_total.setText(String.valueOf(formato.format(total)));

                        }else if(aPesos == "usd2"){

                            txt_total.setText(txt_valor.getText().toString());

                        }else if(aPesos == "eur2"){

                            double valor = Double.parseDouble(txt_valor.getText().toString());
                            double total = valor / 1.11;
                            txt_total.setText(String.valueOf(formato.format(total)));

                        }else if(aPesos == "kwd2"){

                            double valor = Double.parseDouble(txt_valor.getText().toString());
                            double total = valor / 3.29;
                            txt_total.setText(String.valueOf(formato.format(total)));

                        }

                        break;
                    case "eur1":

                        if(aPesos == "dop2"){

                            double valor = Double.parseDouble(txt_valor.getText().toString());
                            double total = valor * 59.22;
                            txt_total.setText(String.valueOf(formato.format(total)));

                        }else if(aPesos == "usd2"){

                            double valor = Double.parseDouble(txt_valor.getText().toString());
                            double total = valor * 1.11;
                            txt_total.setText(String.valueOf(formato.format(total)));

                        }else if(aPesos == "eur2"){

                            txt_total.setText(txt_valor.getText().toString());

                        }else if(aPesos == "kwd2"){

                            double valor = Double.parseDouble(txt_valor.getText().toString());
                            double total = valor / 2.97;
                            txt_total.setText(String.valueOf(formato.format(total)));

                        }

                        break;
                    case "kwd1":

                        if(aPesos == "dop2"){

                            double valor = Double.parseDouble(txt_valor.getText().toString());
                            double total = valor * 175.79;
                            txt_total.setText(String.valueOf(formato.format(total)));

                        }else if(aPesos == "usd2"){

                            double valor = Double.parseDouble(txt_valor.getText().toString());
                            double total = valor * 3.29;
                            txt_total.setText(String.valueOf(formato.format(total)));

                        }else if(aPesos == "eur2"){

                            double valor = Double.parseDouble(txt_valor.getText().toString());
                            double total = valor * 2.97;
                            txt_total.setText(String.valueOf(formato.format(total)));

                        }else if(aPesos == "kwd2"){

                            txt_total.setText(txt_valor.getText().toString());

                        }

                        break;

                }
            }
        });

        btn_punto.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                String cantidad = txt_valor.getText().toString();
                boolean hayPunto = cantidad.contains(".");

                if(hayPunto){
                    Toast.makeText(getApplicationContext(), "Ya pusiste un punto", Toast.LENGTH_SHORT).show();
                }else if(cantidad.length() == 0){
                    Toast.makeText(getApplicationContext(), "No puedes iniciar con punto", Toast.LENGTH_SHORT).show();
                }
                else{
                    int cadena = txt_valor.getText().toString().length();
                    txt_valor.setText(txt_valor.getText() + ".");
                }
            }
        });

        btn_borrar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                int cantidad = txt_valor.getText().length();
                if(cantidad > 0){
                    txt_valor.setText(txt_valor.getText().subSequence(0, cantidad - 1));
                }
            }
        });

        btn_salir.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent volver = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(volver);
            }
        });

    }

    public void eventoClick(View view){
        switch (view.getId()){

            case R.id.btn_dop1:
                btn_dop1.setBackgroundColor(Color.BLUE);
                btn_usd1.setBackgroundColor(Color.GRAY);
                btn_eur1.setBackgroundColor(Color.GRAY);
                btn_kwd1.setBackgroundColor(Color.GRAY);

                dePesos = "dop1";
                break;

            case R.id.btn_usd1:
                btn_usd1.setBackgroundColor(Color.BLUE);
                btn_dop1.setBackgroundColor(Color.GRAY);
                btn_eur1.setBackgroundColor(Color.GRAY);
                btn_kwd1.setBackgroundColor(Color.GRAY);

                dePesos = "usd1";
                break;

            case R.id.btn_eur1:
                btn_eur1.setBackgroundColor(Color.BLUE);
                btn_dop1.setBackgroundColor(Color.GRAY);
                btn_usd1.setBackgroundColor(Color.GRAY);
                btn_kwd1.setBackgroundColor(Color.GRAY);

                dePesos = "eur1";
                break;

            case R.id.btn_kwd1:
                btn_kwd1.setBackgroundColor(Color.BLUE);
                btn_dop1.setBackgroundColor(Color.GRAY);
                btn_usd1.setBackgroundColor(Color.GRAY);
                btn_eur1.setBackgroundColor(Color.GRAY);

                dePesos = "kwd1";
                break;

        }
    }

    public void eventoClick2(View view){
        switch (view.getId()){

            case R.id.btn_dop2:
                btn_dop2.setBackgroundColor(Color.BLUE);
                btn_usd2.setBackgroundColor(Color.GRAY);
                btn_eur2.setBackgroundColor(Color.GRAY);
                btn_kwd2.setBackgroundColor(Color.GRAY);

                aPesos = "dop2";
                break;

            case R.id.btn_usd2:
                btn_usd2.setBackgroundColor(Color.BLUE);
                btn_dop2.setBackgroundColor(Color.GRAY);
                btn_eur2.setBackgroundColor(Color.GRAY);
                btn_kwd2.setBackgroundColor(Color.GRAY);

                aPesos = "usd2";
                break;

            case R.id.btn_eur2:
                btn_eur2.setBackgroundColor(Color.BLUE);
                btn_dop2.setBackgroundColor(Color.GRAY);
                btn_usd2.setBackgroundColor(Color.GRAY);
                btn_kwd2.setBackgroundColor(Color.GRAY);

                aPesos = "eur2";
                break;

            case R.id.btn_kwd2:
                btn_kwd2.setBackgroundColor(Color.BLUE);
                btn_dop2.setBackgroundColor(Color.GRAY);
                btn_usd2.setBackgroundColor(Color.GRAY);
                btn_eur2.setBackgroundColor(Color.GRAY);

                aPesos = "kwd2";
                break;
                default:
                    break;

        }
    }

}
