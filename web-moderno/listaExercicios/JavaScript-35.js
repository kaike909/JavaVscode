let vetorPilha = [1, 2, 3, 4, 5]
let vetorAdc = [6, 7, 8, 9, 10]

function adc(x, y){
    for(let i = 0; i < y.length; i++){
        console.log(y[i])
        x.push(y[i])
    }
    console.log(`Vetor Pilha: ${x}`)
    console.log(`Vetor Adiciona: ${y}`)
}

adc(vetorPilha, vetorAdc)