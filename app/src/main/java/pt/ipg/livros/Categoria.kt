package pt.ipg.livros

import android.content.ContentValues
import android.provider.BaseColumns

data class Categoria(var id: Long, var nome: String) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()
        valores.put(TabelaBDCategorias.CAMPO_NOME, nome)

        return valores
    }
}