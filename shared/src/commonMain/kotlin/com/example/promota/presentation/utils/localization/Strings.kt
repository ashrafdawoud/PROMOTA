package com.example.promota.presentation.utils.localization

val strings = listOf(
    Triple("edit","Edit","تعديل"),
    Triple("history","History","تاريخ المنتج"),
    Triple("remove","Remove","مسح"),
)

fun stringResource(id:String,language:String = "en"):String {
    val item = strings.first { it.first == id.lowercase() }
    return if(language == "en") item.second else item.third
}