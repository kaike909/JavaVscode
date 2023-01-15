function cardapio(x, qtd = 1){
    switch (x){
        case 100:
            console.log(`Voce pediu ${qtd} "Cachorro-Quente" que fica no total de R$${(qtd * 3).toFixed(2).replace('.', ',')}`)
            break
        case 200:
            console.log(`Voce pediu ${qtd} "Hamburguer Simples" que fica no total de R$${(qtd * 4).toFixed(2).replace('.', ',')}`)
            break
        case 300:
            console.log(`Voce pediu ${qtd} "CheeseBurger" que fica no total de R$${(qtd * 5.5).toFixed(2).replace('.', ',')}`)
            break
        case 400:
            console.log(`Voce pediu ${qtd} "Bauru" que fica no total de R$${(qtd * 7.5).toFixed(2).replace('.', ',')}`)
            break
        case 500:
            console.log(`Voce pediu ${qtd} "Refrigerante" que fica no total de R$${(qtd * 3.5).toFixed(2).replace('.', ',')}`)
            break
        case 600:
            console.log(`Voce pediu ${qtd} "Suco" que fica no total de R$${(qtd * 2.8).toFixed(2).replace('.', ',')}`)
    }
}

cardapio(100, 2)
cardapio(200, 3)
cardapio(300, 4)
cardapio(400, 5)
cardapio(500, 6)
cardapio(600, 7)