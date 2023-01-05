function pontinhos(ceu) {
    console.log(`${'-'.repeat(10)} ${ceu} ${'-'.repeat(10)}`)
}
console.log(typeof Object)

class Produto {}

console.log(typeof Produto)

pontinhos("Função 1!")
pontinhos("Função sem retorno!")
function imprimirSoma(a, b){
    console.log(`A soma de ${a} + ${b} é igual a ${a + b}`)
}

imprimirSoma(2, 2)

pontinhos("Função com retorno!")

function soma(a = null, b = null){
    return a + b
}

console.log(soma(2, 3))
console.log(soma(2))
console.log(soma())

pontinhos("Função 2!")
pontinhos("Armazenando função em variável!")

const imprimeSoma = function(a, b){
    console.log(a + b)
}

imprimeSoma(1, 2)

pontinhos("Armazenando uma função arrow numa variável!")

const some = (a, b) => {
    return a + b
}

console.log(some(2, 3))

pontinhos("Retorno implícito")

const subtracao = (a, b) => a - b

console.log(subtracao(3, 2))

const imprimir2 = a => console.log(`${'-'.repeat(3)} ${a} ${'-'.repeat(3)}`)
imprimir2("Quero trabalhar logo na área!")