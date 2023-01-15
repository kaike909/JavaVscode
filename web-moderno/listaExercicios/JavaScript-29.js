function intervalo(...vetor){
    let d = 0, f = 0
    for (let i = 0; i < vetor.length; i++) {
        if (vetor[i] >= 10 && vetor[i] <= 20) {
            d++
        } else {
            f++
        }
    }
    console.log(`${d} numero(s) estao dentro do intervalo de [10,20]\n${f} numero(s) estao fora do mesmo.`)
}

intervalo(1, 15, 4, 21, 10, 20, 17, 8, 9, 7)