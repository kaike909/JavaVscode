const pontinhos = a => console.log(`${'-'.repeat(10)} ${a} ${'-'.repeat(10)}`)
pontinhos('destructuring 1!')

const pessoa = {
    nome: 'Ana',
    idade: 35,
    endereco: {
        logradouro: 'Rua ABC',
        numero: 1000
    }
}
console.log(typeof pessoa)
console.log(pessoa)

const {nome, idade} = pessoa
console.log(nome, idade)

const {nome:n, idade:i} = pessoa
console.log(n, i)

const { sobrenome: s, bemHumorada:bH = true} = pessoa
console.log(s, bH)

const { endereco: {logradouro:lo, numero:num, cep:c}} = pessoa
console.log(lo, num, c)

pontinhos('destructuring 2!')

const [a] = [10]
console.log(a)

const [n1, , n3, , n5, n6 = 0] = [10, 7, 9, 8]
console.log(n1, n3, n5, n6)

const [, [, nota]] = [[, 8, 8], [9, 6, 8]]
console.log(nota)

pontinhos('destructuring 3!')

function rand({min = 0, max = 1000}){
    const valor = Math.random() * (max - min) + min
    return Math.floor(valor)
}

const obj = {max: 50, min: 40}
console.log(rand(obj))
console.log(rand({min: 955}))
console.log(rand({}))

pontinhos('destructuring 4!')

function rand2([min = 0, max = 1000]){
    if(min > max) [min, max] = [max, min]
    const valor = Math.random() * (max - min) + min
    return Math.floor(valor)
}

console.log(rand2([50, 40]))
console.log(rand2([992]))
console.log(rand2([, 10]))
console.log(rand2([]))