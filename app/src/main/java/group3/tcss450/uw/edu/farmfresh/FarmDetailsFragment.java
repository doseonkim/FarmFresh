package group3.tcss450.uw.edu.farmfresh;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FarmDetailsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FarmDetailsFragment} factory method to
 * create an instance of this fragment.
 */
public class FarmDetailsFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    /**
     * Required empty constructor.
     */
    public FarmDetailsFragment() {
        // Required empty public constructor
    }


    /**
     * Initializes the fragment with the given Bundle.
     * @param savedInstanceState state of the Activity
     *                           that called this Fragment.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    /**
     * Sets up layout of fragmentDetails.
     * @param inflater Layout inflater.
     * @param container view group.
     * @param savedInstanceState activity state.
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_farm_details, container, false);
       //ListView lv = (ListView) v.findViewById(R.id.farm_details_list);
        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
       }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {

    }
}
