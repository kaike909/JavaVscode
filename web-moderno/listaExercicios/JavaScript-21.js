function planoDeSaude(idade, valor = 100) {
    let valorAdc
    if (idade < 10) {
        valorAdc = valor += 80
    } else if (idade >= 10 && idade <= 30) {
        valorAdc = valor += 50
    } else if (idade > 30 && idade <= 60) {
        valorAdc = valor += 95
    } else if (idade > 60) {
        valorAdc = valor += 130
    }
    return console.log(`O conveniado vai pagar R$${valorAdc.toFixed(2).replace('.', ',')}`)
}

planoDeSaude(9)
planoDeSaude(26)
planoDeSaude(46)
planoDeSaude(66)