package uby.luca.fragmentfun;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by uburti on 03/03/2018.
 */

public class SquareFragment extends Fragment {
    public SquareFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_square,container,false);
        TextView squareTv=v.findViewById(R.id.fragmentTv);
        squareTv.setText(getArguments().getString("CIAO"));

        return squareTv;

    }
}
