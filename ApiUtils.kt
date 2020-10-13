package com.info.retrofitkullanimi

import com.info.sozlukuygulamasi.KelimelerDaoInterface

class ApiUtils {

    companion object{

        val BASE_URL = "http://kasimadalan.pe.hu/"

        fun getKelimelerDaoInterface(): KelimelerDaoInterface {
            return RetrofitClient.getClient(BASE_URL).create(KelimelerDaoInterface::class.java)
        }
    }
}



