package com.example.navigationwithmvvm_act5.ui.viewmodel


import androidx.lifecycle.ViewModel
import com.example.navigationwithmvvm_act5.model.Mahasiswa

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {

    // only access internal class
    private val _dataModel = MutableStateFlow(Mahasiswa())

    //access for public
    val dataModel: StateFlow<Mahasiswa> = _dataModel.asStateFlow()


}
