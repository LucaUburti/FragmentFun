package uby.luca.fragmentfun;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by uburti on 03/03/2018.
 */

public class SquareFragment extends Fragment {
    int red=255;
    int green=255;
    int blue=255;
    public SquareFragment() {
    }

    private SquareOnClick soc;

    interface SquareOnClick {
        void onColorChanged(String color);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        soc = (SquareOnClick) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_square, container, false);
        final TextView squareTv = v.findViewById(R.id.fragmentTv);
        squareTv.setText(getArguments().getString("CIAO"));

        if (savedInstanceState!=null){
            red=savedInstanceState.getInt("RED");
            green=savedInstanceState.getInt("GREEN");
            blue=savedInstanceState.getInt("BLUE");
            squareTv.setBackgroundColor(Color.rgb(red, green, blue));
        }

        squareTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();


                red=(rand.nextInt(255));
                green=(rand.nextInt(255));
                blue=(rand.nextInt(255));
                Color color = new Color();

                color.red(red);
                color.green(green);
                color.blue(blue);
                soc.onColorChanged("red: "+red+" green: "+green+" blue: "+blue);
                squareTv.setBackgroundColor(Color.rgb(red, green, blue));
            }
        });

        return squareTv;

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("RED",red);
        outState.putInt("GREEN",green);
        outState.putInt("BLUE",blue);
    }
}
