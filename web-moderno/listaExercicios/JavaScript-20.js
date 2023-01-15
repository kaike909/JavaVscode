function saque(x) {
    let cont100 = 0
    let cont50 = 0
    let cont20 = 0
    let cont10 = 0
    let cont5 = 0
    let cont1 = 0
    let valorTotal = calculaSaque(x)
    while(x >= valorTotal){
        switch (valorTotal) {
            case 100:
                cont100++
                x -= 100
                break
            case 50:
                cont50++
                x -= 50
                break
            case 20:
                cont20++
                x -= 20
                break
            case 10:
                cont10++
                x -= 10
                break
            case 5:
                cont5++
                x -= 5
                break
            case 1:
                x -= 1
                cont1++
                break
        }
        valorTotal = calculaSaque(x)
    }
    return totalSaque(cont100, cont50, cont20, cont10, cont5, cont1)
}

function calculaSaque(x) {
    if (x >= 100) {
        return 100
    } else if (x >= 50) {
        return 50
    } else if (x >= 20) {
        return 20
    } else if (x >= 10) {
        return 10
    } else if (x >= 5) {
        return 5
    } else if (x >= 1) {
        return 1
    }
}

function totalSaque(cont100, cont50, cont20, cont10, cont5, cont1) {
    let resultado = ''
    if(cont100 > 0) resultado += `${cont100} nota(s) de R$ 100.\n`
    if(cont50 > 0) resultado += `${cont50} nota(s) de R$ 50.\n`
    if(cont20 > 0) resultado += `${cont20} nota(s) de R$ 20.\n`
    if(cont10 > 0) resultado += `${cont10} nota(s) de R$ 10.\n`
    if(cont5 > 0) resultado += `${cont5} nota(s) de R$ 5.\n`
    if(cont1 > 0) resultado += `${cont1} nota(s) de R$ 1.\n`
    return resultado
}

console.log(saque(153))
console.log(saque(1000))