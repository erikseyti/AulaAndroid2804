package erikseytijohansson.aulaandroid2804;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamarSegundaTela(View view)
    {
        Intent intent = new Intent(this,SegundaTela.class);
        intent.putExtra("timeCampeao","Questionavel");
        intent.putExtra("titulosBrasileiro",0);
        startActivity(intent);

    }
}