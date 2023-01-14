function div(x, y){
    if (y == 0) {
        console.log('Impossivel dividir por 0!')
    } else {
        console.log(`${x} / ${y} = ${(x / y).toFixed(2)} com resto ${x % y}`)
    }
}

div(2, 0)
div(0, 2)
div(3, 5)
div(16, 3)