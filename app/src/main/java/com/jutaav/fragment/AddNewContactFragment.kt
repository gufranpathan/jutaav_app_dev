package com.jutaav.fragment

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnTouchListener
import com.jutaav.R
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentAddNewContactBinding
import com.jutaav.login.LoginPasswordActivity
import com.jutaav.login.SignupOrgNameActivity
import com.wada811.viewbinding.viewBinding
import java.text.SimpleDateFormat
import java.util.*


class AddNewContactFragment :
    BaseFragment<FragmentAddNewContactBinding>(R.layout.fragment_add_new_contact) {

    override val binding: FragmentAddNewContactBinding by viewBinding(FragmentAddNewContactBinding::bind)

    private var mDatePickerDialog: DatePickerDialog? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setDateTimeField()

        binding.tvDateOfBirth.setOnTouchListener(OnTouchListener { v, event ->
            mDatePickerDialog!!.show()
            false
        })

        binding.mbAddNewContact.setOnClickListener {
            val intent = Intent(requireActivity(), LoginPasswordActivity::class.java)
            activity?.startActivity(intent)
        }

        binding.mbSaveChanges.setOnClickListener {
            val intent = Intent(requireActivity(), SignupOrgNameActivity::class.java)
            activity?.startActivity(intent)
        }
    }

    private fun setDateTimeField() {
        val newCalendar: Calendar = Calendar.getInstance()
        mDatePickerDialog = DatePickerDialog(
            requireContext(),
            { view, year, monthOfYear, dayOfMonth ->
                val newDate: Calendar = Calendar.getInstance()
                newDate.set(year, monthOfYear, dayOfMonth)
                val sd = SimpleDateFormat("dd-MM-yyyy")
                val startDate: Date = newDate.getTime()
                val fdate: String = sd.format(startDate)
                binding.tvDateOfBirth.setText(fdate)
            },
            newCalendar.get(Calendar.YEAR),
            newCalendar.get(Calendar.MONTH),
            newCalendar.get(Calendar.DAY_OF_MONTH)
        )
        mDatePickerDialog!!.getDatePicker().maxDate = System.currentTimeMillis()
    }
}