package com.example.inputpenggunatugas.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.example.inputpenggunatugas.R


@Composable
fun FormulirPendaftaran(modifier: Modifier) {
    val context = LocalContext.current

    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenisKelamin by remember { mutableStateOf(value = "") }
    var status by remember { mutableStateOf(value = "") }

    val genderList = listOf(
        stringResource(id = R.string.gender_male),
        stringResource(id= R.string.gender_female)
    )
    val statusList = listOf(
        stringResource(id = R.string.status_janda),
        stringResource(id= R.string.status_lajang),
        stringResource(id= R.string.status_duda)
    )
