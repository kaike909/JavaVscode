function nota(...x) {
    let notaA = []
    for(let i = 0; i < x.length; i++){
        if(x[i] >= 0 && x[i] <= 4.9) notaA.push('D')
        else if(x[i] >= 5 && x[i] <= 6.9) notaA.push('C')
        else if(x[i] >= 7 && x[i] <= 8.9) notaA.push('B')
        else if(x[i] >= 9 && x[i] <= 10) notaA.push('A')
        else notaA.push('Nota Invalida')
    }
    console.log(notaA)
}

nota(10, 13, 9, 8.2, 2.5, 7.7, 6.8)