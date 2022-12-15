package ca.elina.a7_livedatafundamentals

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel() {
    // Step 1 -  change “total ” variable to a mutable live data of type int.
//    private var total = 0
    // since we are going observe this from the main activity, we need to remove theprivate modifier.
    var total = MutableLiveData<Int>()

    init {
        // This total variable is a MutableLiveData. So we cannot just assign the startingTotal variable to it.
        //We need to get the value property of it and , then assign the starting total to it.
        // Step 2 - remove   total = startingTotal
        total.value = startingTotal
    }


    //  We don’t need this getTotal function. We are going to observe the variable from the activity.
    // Step 3 - remove fun getTotal(): Int { return total }

    // Inside this setTotal function, we need to write codes to add the input number to current total.
    fun setTotal(input: Int) {
        // Step 4 change   total += input into ...
        total.value = (total.value)?.plus(input)
    }
}

// What is MutableLiveData?
// What is the difference between MutableLiveData and LiveData?
// Data in a LiveData object are only readable. We cannot update those data.
// MutableLive data class is a subclass of LiveData class.
// A Mutable LiveData object allows us to change its data.
// As we need to always update the value of the total, so here it has to Be MutableLiveData.