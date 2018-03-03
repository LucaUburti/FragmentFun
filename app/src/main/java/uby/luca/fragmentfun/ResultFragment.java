package uby.luca.fragmentfun;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by uburti on 03/03/2018.
 */

public class ResultFragment extends Fragment{
    public ResultFragment() {
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_result,container,false);
        TextView resultsTv=v.findViewById(R.id.results_tv);


        String results=getArguments().getString("RESULTS");
        resultsTv.setText(results);


        return v;
    }
}
