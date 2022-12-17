package ca.elina.a12_navigationarchitecturecomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import ca.elina.a12_navigationarchitecturecomponents.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {
    // Step 24.1 - construct data binding object
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Step 24.2 - construct data binding object
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)

        // Step 24.3 - construct data binding object
        return binding.root
    }

}
