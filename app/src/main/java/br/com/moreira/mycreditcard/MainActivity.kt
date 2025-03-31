package br.com.moreira.mycreditcard

import android.os.Bundle
import android.widget.FrameLayout
import android.widget.RelativeLayout
import android.widget.ViewFlipper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var cardFlipper: ViewFlipper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_front)

        // Inicializa o ViewFlipper
        cardFlipper = findViewById(R.id.card_flipper)

        val cardFrontView = cardFlipper.findViewById<FrameLayout>(R.id.card_front)
        val cardBackView = cardFlipper.findViewById<RelativeLayout>(R.id.card_back)

        cardFrontView.setBackgroundResource(R.drawable.rounded_card_background)
        cardBackView.setBackgroundResource(R.drawable.rounded_card_background)

        // Define o OnClickListener no ViewFlipper para alternar entre frente e verso do cartão
        cardFlipper.setOnClickListener {
            cardFlipper.showNext() // Alterna entre as views do cartão (frente e verso)
        }
    }
}