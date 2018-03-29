package erikseytijohansson.aulaandroid2804;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lisViewTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lisViewTimes = (ListView)findViewById(R.id.listTimes);

        String times[] = {"Flamengo","ACP","Internacional","Avai"};

        ArrayAdapter<String> adapterTimes =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,times);

        lisViewTimes.setAdapter(adapterTimes);
    }

    public void chamarSegundaTela(View view)
    {
        Intent intent = new Intent(this,SegundaTela.class);
        intent.putExtra("timeCampeao","Questionavel");
        intent.putExtra("titulosBrasileiro",0);
        startActivity(intent);

    }
}
