function troca(v1, v2){
    if(v1.length == v2.length){
        for (let i = 0; i < v1.length; i++){
            v1[i] = v1[i] + v2[i]
            v2[i] = v1[i] - v2[i]
            v1[i] = v1[i] - v2[i]
        }
    } else {
        console.log('Vetores de tamanhos diferentes')
    }
    console.log(`Vetor A: ${v1}`)
    console.log(`Vetor B: ${v2}`)
}

let vet1 = [1, 2, 3]
let vet2 = [4, 5, 6]

troca(vet1, vet2)