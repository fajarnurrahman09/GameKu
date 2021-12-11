package com.example.gameku

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize

data class Game (
   val imgGame: Int,
   val nameGame: String,
   val descGame: String
): Parcelable

