package simulacion.zamudio.tiroparabolico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcular;
    private EditText txtVelocidad, txtAngulo;
    private TextView lblTiempo, lblAlturaMax, lblAlcanse;
    private Calcular cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cl = new Calcular();

        btnCalcular = findViewById(R.id.btnCalcular);
        txtVelocidad = findViewById(R.id.txtVelocidad);
        txtAngulo = findViewById(R.id.txtAngulo);
        lblTiempo = findViewById(R.id.lblTiempo);
        lblAlturaMax = findViewById(R.id.lblAlturaMax);
        lblAlcanse = findViewById(R.id.lblAlcance);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                capturar();
            }
        });
    }

    public void capturar(){
        double vo,an;
        vo = Double.parseDouble(txtVelocidad.getText().toString());
        an = Double.parseDouble(txtAngulo.getText().toString());
        cl.setVi(vo);
        cl.setTeta(an);
        cl.calcular();
        lblTiempo.setText("Tiempo: " + cl.getT());
        lblAlturaMax.setText("Altura Max: " + cl.getD());
        lblAlcanse.setText("Alcance: " + cl.getR());
    }

}
