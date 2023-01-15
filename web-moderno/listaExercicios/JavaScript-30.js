function maiorEMenor(...vetor){
    let maior = vetor[0], menor = vetor[0]
    for (let i = 0; i < vetor.length; i++){
        if (vetor[i] > maior){
            maior = vetor[i]
        }
        if (vetor[i] < menor) {
            menor = vetor[i]
        }
    }
    console.log(`O maior numero do vetor é: ${maior}.\nO menor numero do vetor é: ${menor}.`)
}

maiorEMenor(15, 2, 6, 18, 0, 33)