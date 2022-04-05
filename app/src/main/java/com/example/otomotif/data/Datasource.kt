package com.example.otomotif.data

import com.example.otomotif.R
import com.example.otomotif.model.Otomotif

class Datasource {

    fun loadAffirmations(): List<Otomotif> {
        return listOf<Otomotif>(
            Otomotif(R.string.motor1, R.drawable.image1),
            Otomotif(R.string.motor2, R.drawable.image2),
            Otomotif(R.string.motor3, R.drawable.image3),
            Otomotif(R.string.motor4, R.drawable.image4),
            Otomotif(R.string.motor5, R.drawable.image5),
            Otomotif(R.string.motor6, R.drawable.image6),
            Otomotif(R.string.motor7, R.drawable.image7),
            Otomotif(R.string.motor8, R.drawable.image8),
            Otomotif(R.string.motor9, R.drawable.image9),
            Otomotif(R.string.motor10, R.drawable.image10)
        )
    }
}