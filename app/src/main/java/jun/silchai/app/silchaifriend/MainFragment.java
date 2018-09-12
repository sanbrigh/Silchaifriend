package jun.silchai.app.silchaifriend;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

//    Explicity
    private int dayAnInt,monAnInt,yeaAnInt,hourAnInt, minusAnInt;



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();

//        Spinner Customer
        spinnerCustomer();

//        ReceivePO Date
        receivePODate();


    }   //Main Method

    private void receivePODate() {
        ImageView imageView = getView().findViewById(R.id.imvReceivePO);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });
    }

    private void spinnerCustomer() {
        Spinner spinner = getView().findViewById(R.id.spinnerCustomer);

        String[] customerStrings = new String[]{"Please Choose Customer","Doramon","Superman","Batman"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,customerStrings);
        spinner.setAdapter(stringArrayAdapter);
    }


    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarMain);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle(getString(R.string.follow));
        setHasOptionsMenu(true);
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main, menu);
    }

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

}
