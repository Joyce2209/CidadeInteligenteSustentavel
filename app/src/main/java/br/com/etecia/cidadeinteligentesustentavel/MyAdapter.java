package br.com.etecia.cidadeinteligentesustentavel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context mContexto;
    private List<DescLixo> listaLixo;

    public MyAdapter(Context mContexto, List<DescLixo> listaLixo) {
        this.mContexto = mContexto;
        this.listaLixo = listaLixo;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.idCausaLixo.setText(listaLixo.get(position).getTitulo());
        holder.idImgLixo.setImageResource(listaLixo.get(position).getImagem());
        holder.idCardViewLixo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContexto, ApresentaLixoActivity.class);

                intent.putExtra("Titulo", listaLixo.get(position).getTitulo());
                intent.putExtra("Descricao", listaLixo.get(position).getDescricao());
                intent.putExtra("ImagemFilme", listaLixo.get(position).getImagem());

                mContexto.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));

            }
        });
    }

    @Override
    public int getItemCount() {
        return listaLixo.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView idCausaLixo;
        ImageView idImgLixo;
        CardView idCardViewLixo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idCausaLixo = itemView.findViewById(R.id.idCausaLixo);
            idImgLixo = itemView.findViewById(R.id.idImglixo);
            idCardViewLixo = itemView.findViewById(R.id.idCardViewLixo);
        }
    }
}
