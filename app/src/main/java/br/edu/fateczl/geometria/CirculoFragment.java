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

import br.edu.fateczl.geometria.controller.CirculoController;
import br.edu.fateczl.geometria.controller.IGeometriaController;
import br.edu.fateczl.geometria.model.Circulo;

public class CirculoFragment extends Fragment {

    private View view;
    private EditText inputDiametro;
    private Button btnCalcularArea;
    private Button btnCalcularPerimetro;
    private TextView tvResultadoCirculo;

    public CirculoFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_circulo, container, false);
        inputDiametro = view.findViewById(R.id.inputDiametro);
        btnCalcularArea = view.findViewById(R.id.btnCalcularArea);
        btnCalcularPerimetro = view.findViewById(R.id.btnCalcularPerimetro);
        tvResultadoCirculo = view.findViewById(R.id.tvResultadoCirculo);

        btnCalcularArea.setOnClickListener(op -> calcularArea());
        btnCalcularPerimetro.setOnClickListener(op -> calcularPerimetro());
        return view;
    }

    private void calcularArea() {
        Circulo c = new Circulo();
        c.setDiametro(Float.parseFloat(inputDiametro.getText().toString()));

        IGeometriaController<Circulo> controller = new CirculoController();
        float area = controller.calcularArea(c);
        tvResultadoCirculo.setText("Área = " + area);
        limpaCampos();
    }

    private void calcularPerimetro() {
        Circulo c = new Circulo();
        c.setDiametro(Float.parseFloat(inputDiametro.getText().toString()));

        IGeometriaController<Circulo> controller = new CirculoController();
        float perimetro = controller.calcularPerimetro(c);
        tvResultadoCirculo.setText("Perímetro = " + perimetro);
        limpaCampos();
    }

    private void limpaCampos() {
        inputDiametro.setText("");
    }
}
