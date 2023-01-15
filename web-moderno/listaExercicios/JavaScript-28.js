function parOuImpar(...vetor) {
    let impar = 0, par = 0
    for (let i = 0; i < vetor.length; i++) {
        if(vetor[i] % 2 == 0) {
            par++
        } else {
            impar ++
        }
    }
    console.log(`Impares: ${impar} numero(s)\nPares: ${par} numero(s)`)
}

parOuImpar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)