function negativo(...x){
    let neg = 0
    for (let i = 0; i < x.length; i++){
        if(x[i] < 0) {
            console.log(`${x[i]}`)
            neg++
        }
    }
    console.log(`Existem: ${neg} numero(s) negativo(s)`)
}

negativo(0, 1, 3, -1, 6, -3, -54)