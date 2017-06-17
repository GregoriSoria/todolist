package admin.com.todolist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

    private EditText meuTexto;
    private ListView minhaLista;
    private Button meuBotao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meuTexto = (EditText) findViewById(R.id.meuTexto);
        minhaLista = (ListView) findViewById(R.id.minhaLista);
        meuBotao = (Button) findViewById(R.id.inserir_tarefa);
    }
}