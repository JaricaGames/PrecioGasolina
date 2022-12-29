package com.jarica.preciogasolina.data.network.response

import com.google.gson.annotations.SerializedName

data class GasByGasolineAndTownResponse(
    @SerializedName("Fecha") var fecha: String,
    @SerializedName("ListaEESSPrecio") var ListaEESSPrecio: ArrayList<GasolineraPorGasolinaYMunicipio>,
    @SerializedName("Nota") var nota: String,
    @SerializedName("ResultadoConsulta") var resultadoConsulta: String,
)
