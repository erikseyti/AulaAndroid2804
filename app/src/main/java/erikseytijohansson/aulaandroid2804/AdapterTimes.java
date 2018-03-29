package erikseytijohansson.aulaandroid2804;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aluno on 28/03/18.
 */

public class AdapterTimes extends BaseAdapter {

    Context contexto;
    List<Time> times;

    public AdapterTimes(Context contexto, List<Time> times) {
        this.contexto = contexto;
        this.times = times;
    }

    @Override
    public int getCount() {
        return times.size();
    }

    @Override
    public Object getItem(int position) {
        return times.get(position);
    }

    @Override
    public long getItemId(int position) {
        return times.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewLinha = LayoutInflater.from(contexto).inflate(R.layout.linha_lista_times,parent,false);
        ImageView imageTime = (ImageView) viewLinha.findViewById(R.id.imagemCoelho);
        TextView nome = (TextView) viewLinha.findViewById(R.id.textViewNome);
        TextView cidade = (TextView) viewLinha.findViewById(R.id.textViewCidade);
        Time time = times.get(position);
        imageTime.setImageResource(time.getImagem());
        nome.setText(time.getNome());
        cidade.setText(time.getCidade());
        return viewLinha;
    }
}
