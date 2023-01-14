function melhoraReal(x, y){
    let dif = x + y
    return console.log(`R$${dif.toFixed(2).replace('.', ',')}`)
}

melhoraReal(0.1, 0.2)