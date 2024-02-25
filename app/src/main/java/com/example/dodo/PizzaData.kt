package com.example.dodo


object PizzaData {
    var pizzas: MutableList<Pizza> = mutableListOf(
        Pizza(
            1,
            "Баварская",
            "Классическая пицца с томатами и моцареллой",
            "https://dodopizza-a.akamaihd.net/static/Img/Products/11eebaa6544b613697512c486cf81fc0_292x292.webp",
            2700
        ),
        Pizza(
            2,
            "Сырная",
            "Моцарелла, сыры чеддер и прамезан, соус альфредо",
            "https://dodopizza-a.akamaihd.net/static/Img/Products/9f32d6faf1354a35af835143ff52a68f_292x292.webp",
            1900
        ),
        Pizza(
            3,
            "Пепперони с грибами",
            "Пикантная пепперони, моцарела, шампиньоны, соус альфредо",
            "https://dodopizza-a.akamaihd.net/static/Img/Products/5901c998d4054941b54c541ff036d96b_292x292.webp",
            2000
        ),
        Pizza(
            4,
            "Двойной цепленок",
            "Цепленок, моцарелла, соус альфредо",
            "https://dodopizza-a.akamaihd.net/static/Img/Products/51cbb001363c4740bda09200b14301a5_292x292.webp",
            2100
        ),
        Pizza(
            5,
            "Пицца Жюльен",
            "Цепленок, шампиньоны, ароматный грибной соус, лук, сухой чеснок, моцарелла, смесь сыров чеддер и прамезан, фирменный соус альфредо",
            "https://dodopizza-a.akamaihd.net/static/Img/Products/b0ecf914467a4dc5a138570e8731f30c_292x292.webp",
            2700
        ),
        Pizza(
            6,
            "Пепперони Фреш",
            "Пикантная пепперони, мно-о-го моцареллы, томаты и томатный соус",
            "https://dodopizza-a.akamaihd.net/static/Img/Products/b9e9517672f94fd98640017e61d35205_292x292.webp",
            1900
        ),
        Pizza(
            7,
            "Ветчина и Сыр",
            "Ветчина, моцарелла и соус альфредо - просто и со вкусом",
            "https://dodopizza-a.akamaihd.net/static/Img/Products/6b7eb484d92b4bceb64b543012bcc1ef_292x292.webp",
            2000
        ),
        Pizza(
            8,
            "Карбонара",
            "Ветчина из цепленка, сыры чеддер и пармезан, томаты, красный лучок, моцарелла, соус альфредо, чеснок и итальянские травы",
            "https://dodopizza-a.akamaihd.net/static/Img/Products/7d5fc5b73d3f4ed09a11d989c46c02bb_292x292.webp",
            2400
        ),
        Pizza(
            9,
            "Пепперони-сердце",
            "Уникальная пицца в формате сердца. Томатный соус, пепперони, моцарелла",
            "https://dodopizza-a.akamaihd.net/static/Img/Products/11eeca3858c79a01b7a644c5a5d81524_292x292.webp",
            3500
        ),
        Pizza(
            10,
            "Бургер-пицца",
            "Сыр моцарелла, ветчина, лук красный, томаты, маринованые огурчики, соус  Бургер, чеснок, томатный соус",
            "https://dodopizza-a.akamaihd.net/static/Img/Products/5a6c858feec44b85bf85d72d2a50e3d2_292x292.webp",
            2700
        )
    )

    fun getPizzaList(): List<Pizza> = pizzas

    fun addAll(newPizzas: MutableList<Pizza>) {
        pizzas.addAll(newPizzas)
    }
}
