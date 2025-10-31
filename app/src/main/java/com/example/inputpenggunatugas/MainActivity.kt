package com.example.inputpenggunatugas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.inputpenggunatugas.ui.theme.FormulirPendaftaran
import com.example.inputpenggunatugas.ui.theme.InputPenggunaTugasTheme
import androidx.compose.runtime.Composable



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InputPenggunaTugasTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    // ✅ innerPadding sekarang digunakan supaya konten tidak ketiban status bar
                    FormulirPendaftaran(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FormulirPendaftaranPreview() {
    InputPenggunaTugasTheme {
        FormulirPendaftaran()
    }
}
