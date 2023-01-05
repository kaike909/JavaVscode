console.log(typeof Object)

class Produto {}

console.log(typeof Produto)

console.log("------ Funcao 1! ------")
console.log("- Função sem retorno! -")

function imprimirSoma(a, b){
    console.log(`A soma de ${a} + ${b} é igual a ${a + b}`)
}

imprimirSoma(2, 2)

console.log("- Função com retorno! -")

function soma(a = 0, b = 0){
    return a + b
}

console.log(soma(2, 3))
console.log(soma(2))
console.log(soma())