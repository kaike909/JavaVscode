function impares(min = 0, max = 100){
    if (min > max){
        let z = min
        min = max
        max = z
    }
    let impar = []
    for (let i = min; i < max; i++) {
        if (i % 2 != 0) impar.push(i)
    }
    console.log(impar)
}

impares(100, 70)