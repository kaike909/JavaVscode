function pontos(nota){
    let notaCorrigida = arredondar(nota)
    if(notaCorrigida >= 40){
        console.log(`Aprovado com nota ${notaCorrigida}`)
    } else {
        console.log(`Reprovado com nota ${notaCorrigida}`)
    }
}

function arredondar(nota){
    if (nota % 5 > 2) {
        return nota + (5 - (nota % 5))
    } else {
        return nota
    }
}

pontos(100)
pontos(58)
pontos(53)
pontos(38)
pontos(37)
pontos(29)