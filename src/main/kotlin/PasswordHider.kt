object PasswordHider {

    class QueryParameter private constructor (val key: String, val value: String) {

        companion object {
            fun from(queryString: String): QueryParameter {
                val key = queryString.split("=")[0]
                val value = queryString.split("=")[1]

                return QueryParameter(key, value)
            }

            fun mask(queryParameter: QueryParameter): QueryParameter {
                val key = queryParameter.key
                val value = "*".repeat(queryParameter.value.length)

                return QueryParameter(key, value)
            }
        }

        fun asString(): String {
            return key.plus("=").plus(value)
        }
    }

    fun hidePasswordFromConnection(urlString: String): String {
        val url = urlString.split('?')[0]
        val queryParameters = urlString
            .split('?')[1]
            .split('&')
            .map { QueryParameter.from(it) }
            .map {
                when (it.key) {
                    "password" -> QueryParameter.mask(it)
                    else -> it
                }
            }.joinToString("&", transform = QueryParameter::asString)

        return url.plus('?').plus(queryParameters)
//    return Regex("(?<=password=)[^&]*").replace(url) { "*".repeat(it.value.length) }
    }
}
