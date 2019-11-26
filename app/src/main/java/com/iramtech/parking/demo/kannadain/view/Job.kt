package com.iramtech.parking.demo.kannadain.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iramtech.parking.demo.kannadain.R
import kotlinx.android.synthetic.main.fragment_job.*

/**
 * A simple [Fragment] subclass.
 */
class Job : Fragment() {

    private val title by lazy(LazyThreadSafetyMode.NONE) { arguments?.getString("title") ?: "" }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_job, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        jobFragmentLabel.text = title
    }


}
