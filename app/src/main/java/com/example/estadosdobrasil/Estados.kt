package com.example.estadosdobrasil


data class Estados(
    val img: Int,
    val nome: String,
    val capital: String,
    val populacao: String,
    val regiao: String
)

object EstadosData {
    fun getEstados(): List<Estados> {
        return listOf(
            Estados(R.drawable.acre, "Acre", "Rio Branco", "894.470", "Norte"),
            Estados(R.drawable.alagoas, "Alagoas", "Maceió", "3.351.543", "Nordeste"),
            Estados(R.drawable.amapa, "Amapá", "Macapá", "861.773", "Norte"),
            Estados(R.drawable.amazonas, "Amazonas", "Manaus", "4.207.714", "Norte"),
            Estados(R.drawable.bahia, "Bahia", "Salvador", "14.930.634", "Nordeste"),
            Estados(R.drawable.ceara, "Ceará", "Fortaleza", "9.187.103", "Nordeste"),
            Estados(R.drawable.espiritosanto, "Espírito Santo", "Vitória", "4.064.052", "Sudeste"),
            Estados(R.drawable.goias, "Goiás", "Goiânia", "7.113.540", "Centro-Oeste"),
            Estados(R.drawable.maranhao, "Maranhão", "São Luís", "7.114.598", "Nordeste"),
            Estados(R.drawable.matogrosso, "Mato Grosso", "Cuiabá", "3.526.220", "Centro-Oeste"),
            Estados(R.drawable.matogrossosul, "Mato Grosso do Sul", "Campo Grande", "2.809.394", "Centro-Oeste"),
            Estados(R.drawable.minasgerais, "Minas Gerais", "Belo Horizonte", "21.292.666", "Sudeste"),
            Estados(R.drawable.para, "Pará", "Belém", "8.690.745", "Norte"),
            Estados(R.drawable.paraiba, "Paraíba", "João Pessoa", "4.039.277", "Nordeste"),
            Estados(R.drawable.parana, "Paraná", "Curitiba", "11.516.840", "Sul"),
            Estados(R.drawable.pernambuco, "Pernambuco", "Recife", "9.616.621", "Nordeste"),
            Estados(R.drawable.piaui, "Piauí", "Teresina", "3.281.480", "Nordeste"),
            Estados(R.drawable.riodejaneiro, "Rio de Janeiro", "Rio de Janeiro", "17.366.189", "Sudeste"),
            Estados(R.drawable.riograndedonorte, "Rio Grande do Norte", "Natal", "3.534.165", "Nordeste"),
            Estados(R.drawable.riograndedosul, "Rio Grande do Sul", "Porto Alegre", "11.422.973", "Sul"),
            Estados(R.drawable.rondonia, "Rondônia", "Porto Velho", "1.796.460", "Norte"),
            Estados(R.drawable.roraima, "Roraima", "Boa Vista", "631.181", "Norte"),
            Estados(R.drawable.santacatarina, "Santa Catarina", "Florianópolis", "7.252.502", "Sul"),
            Estados(R.drawable.saopaulo, "São Paulo", "São Paulo", "45.919.049", "Sudeste"),
            Estados(R.drawable.sergipe, "Sergipe", "Aracaju", "2.318.822", "Nordeste"),
            Estados(R.drawable.tocantis, "Tocantins", "Palmas", "1.590.248", "Norte")
        )
    }
}