package com.example.inputpenggunatugas.ui.theme

import androidx.compose.runtime.Composable

@Composable
fun FormulirPendaftaran(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }