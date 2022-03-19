package com.example.cryptocrazy.service

import com.example.cryptocrazy.model.Crypto
import com.example.cryptocrazy.model.CryptoList
import com.example.cryptocrazy.util.Resource
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by aarslan on 13/03/2022.
 */
interface CryptoAPI {

    //prices?key=APIKEY
    @GET("atilsamancioglu/IA32-CryptoComposeData/main/cryptolist.json")
    suspend fun  getCryptoList() : CryptoList

    //currencies?key=APIKEY=BTC&attributes=id,name,logo_url
    @GET("atilsamancioglu/IA32-CryptoComposeData/main/crypto.json")
    suspend fun  getCrypto() :Crypto
}