const pontinhos = a => console.log(`${'-'.repeat(10)} ${a} ${'-'.repeat(10)}`)
pontinhos('If/Else')

const imprimirResultado = function(nota){
    if(nota >= 7){
        console.log(`Aprovado com nota ${nota}`)
    } else {
        console.log(`Reprovado com nota ${nota}`)
    }
}

imprimirResultado(10)
imprimirResultado(6.9)

pontinhos('If/Else If')

Number.prototype.entre = function (inicio, fim){
    return this >= inicio && this <= fim
}

const imprimirResultado1 = function(nota) {
    if(nota.entre(9, 10)){
        console.log('Quadro de Honra! <3')
    } else if(nota.entre(7, 8.99)){
        console.log('Aprovado! :)')
    } else if(nota.entre(4, 6.99)){
        console.log('Recuperação! :/')
    } else if(nota.entre(0, 3.99)){
        console.log('Reprovado! :(')
    } else {
        console.log('Nota Inválida!')
    }
    console.log('Fim!')
}

imprimirResultado1(10)
imprimirResultado1(7)
imprimirResultado1(5)
imprimirResultado1(2)
imprimirResultado1(11)