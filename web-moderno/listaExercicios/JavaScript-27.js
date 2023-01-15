function criancas(c1, tx1, c2, tx2){
    if (c1 == c2){
        if (tx1 > tx2) {
            console.log('A crianca 1 ultrapassara a crianca 2 em 1 ano')
        } else if (tx1 < tx2) {
            console.log('A crianca 2 ultrapassara a crianca 1 em 1 ano')
        } else {
            console.log('As criancas tem igual altura e crescimento')
        }
    } else {
        if (c1 > c2) {
            if (tx1 >= tx2) {
                console.log('A crianca menor nao ultrapassara a maior')
            } else {
                console.log(`A crianca menor ultrapassara a maior em ${crescimento(c2, tx2, c1, tx1)} anos`)
            }
        } else {
            if (tx2 >= tx1) {
                console.log('A crianca menor nao ultrapassara a maior')
            } else {
                console.log(`A crianca menor ultrapassara a maiot em ${crescimento(c1, tx1, c2, tx2)} anos`)
            }
        }
    }
}

function crescimento(altMenor, txMenor, altMaior, txMaior) {
    let anos = 0
    while(altMenor < altMaior) {
        altMenor += txMenor
        altMaior += txMaior
        anos++
    }
    return anos
}

criancas(120, 4, 120, 3)
criancas(120, 3, 120, 4)
criancas(120, 3, 120, 3)
criancas(120, 3, 110, 3)
criancas(120, 3, 110, 4)
criancas(110, 3, 120, 3)
criancas(110, 4, 120, 3)