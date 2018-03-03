package uby.luca.fragmentfun;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SquareFragment.SquareOnClick {

    @Override
    public void onColorChanged(String color) {
        Snackbar.make(findViewById(R.id.main_layout), "Color: " + color, Snackbar.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        SquareFragment row1col1 = new SquareFragment();
        Bundle b11 = new Bundle();
        b11.putString("CIAO", "row1 col1");
        row1col1.setArguments(b11);

        SquareFragment row2col1 = new SquareFragment();
        Bundle b21 = new Bundle();
        b21.putString("CIAO", "row2 col1");
        row2col1.setArguments(b21);


        SquareFragment row3col1 = new SquareFragment();
        Bundle b31 = new Bundle();
        b31.putString("CIAO", "row3 col1");
        row3col1.setArguments(b31);

        SquareFragment row1col2 = new SquareFragment();
        Bundle b12 = new Bundle();
        b12.putString("CIAO", "row1 col2");
        row1col2.setArguments(b12);


        SquareFragment row2col2 = new SquareFragment();
        Bundle b22 = new Bundle();
        b22.putString("CIAO", "row2 col2");
        row2col2.setArguments(b22);

        SquareFragment row3col2 = new SquareFragment();
        Bundle b32 = new Bundle();
        b32.putString("CIAO", "row3 col2");
        row3col2.setArguments(b32);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.row1col1, row1col1)
                .add(R.id.row2col1, row2col1)
                .add(R.id.row3col1, row3col1)
                .add(R.id.row1col2, row1col2)
                .add(R.id.row2col2, row2col2)
                .add(R.id.row3col2, row3col2)
                .commit();

    }


}
