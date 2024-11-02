/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */


package br.edu.fateczl.geometria;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.edu.fateczl.geometria.controller.IGeometriaController;
import br.edu.fateczl.geometria.controller.RetanguloController;
import br.edu.fateczl.geometria.model.Retangulo;

public class RetanguloFragment extends Fragment {

    private View view;
    private EditText inputAltura;
    private EditText inputBase;
    private Button btnCalcularAreaRetangulo;
    private Button btnCalcularPerimetroRetangulo;
    private TextView tvResultadoRetangulo;

    public RetanguloFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_retangulo, container, false);
        inputAltura = view.findViewById(R.id.inputAltura);
        inputBase = view.findViewById(R.id.inputBase);
        btnCalcularAreaRetangulo = view.findViewById(R.id.btnCalcularAreaRetangulo);
        btnCalcularPerimetroRetangulo = view.findViewById(R.id.btnCalcularPerimetroRetangulo);
        tvResultadoRetangulo = view.findViewById(R.id.tvResultadoRetangulo);
        tvResultadoRetangulo.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnCalcularAreaRetangulo.setOnClickListener(op -> calcularArea());
        btnCalcularPerimetroRetangulo.setOnClickListener(op -> calcularPerimetro());
        return view;
    }

    private void calcularArea() {
        Retangulo r = new Retangulo();
        r.setAltura(Float.parseFloat(inputAltura.getText().toString()));
        r.setBase(Float.parseFloat(inputBase.getText().toString()));

        IGeometriaController<Retangulo> controller = new RetanguloController();
        float area = controller.calcularArea(r);
        tvResultadoRetangulo.setText("Área = " + area);
        limpaCampos();
    }

    private void calcularPerimetro() {
        Retangulo r = new Retangulo();
        r.setAltura(Float.parseFloat(inputAltura.getText().toString()));
        r.setBase(Float.parseFloat(inputBase.getText().toString()));

        IGeometriaController<Retangulo> controller = new RetanguloController();
        float perimetro = controller.calcularPerimetro(r);
        tvResultadoRetangulo.setText("Perímetro = " + perimetro);
        limpaCampos();
    }

    private void limpaCampos() {
        inputAltura.setText("");
        inputBase.setText("");
    }
}
