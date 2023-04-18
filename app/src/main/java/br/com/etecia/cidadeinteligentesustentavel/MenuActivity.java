package br.com.etecia.cidadeinteligentesustentavel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    List<DescLixo> listaLixo;
    RecyclerView idRecyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idRecyclerView = findViewById(R.id.idListaLixo);

        listaLixo = new ArrayList<>();

        listaLixo.add(
                new DescLixo("Impacto ambiental", "Olá", "Impacto", R.drawable.natureza)
        );

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);
    }
}