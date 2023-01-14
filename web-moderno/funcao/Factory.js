const pontinhos = data => console.log(`${'-'.repeat(15)} ${data} ${'-'.repeat(15)}`)

pontinhos('Factory 1!')

function criarPessoa() {
    return {
        nome: 'Ana',
        sobrenome: 'Silva'
    }
}

console.log(criarPessoa())

pontinhos('Factory 2!')

function criarProduto(nome, preco) {
    return {
        nome, preco, desconto: 0.1
    }
}

console.log(criarProduto('Tv', 3000))
console.log(criarProduto('iPad', 2599.99))

pontinhos('Class x Factory!')

class Pessoa{
    constructor(nome){
        this.nome = nome
    }

    falar() {
        console.log(`Meu nome é ${this.nome}`)
    }
}

const p1 = new Pessoa('Carlos')
p1.falar()

const criarPessoa2 = nome => {
    return {
        falar: () => console.log(`Meu nome é ${nome}`)
    }
}

const p2 = criarPessoa2('Carlos')
p2.falar()

pontinhos('Desafio Construtora')

function Pessoa2(nome){
    this.nome = nome

    this.falar = function() {
        console.log(`Meu nome é ${this.nome}`)
    }
}

const p3 = new Pessoa2('Carlos')
p3.falar()