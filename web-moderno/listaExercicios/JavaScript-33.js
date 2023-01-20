let vetorInteiro = [1, 2, 3, 4]
let vetorString = ['a', 'b', 'c', 'd']
let vetorDouble = [1.2, 3.4, 5.6, 7.8]

function concatenar(...x) {
    let result = []
    for (let i = 0; i < arguments.length; i++) {
        result = result.concat(arguments[i])
    }
    console.log(result)
}

concatenar(vetorInteiro, vetorString)
concatenar(vetorDouble, vetorString)