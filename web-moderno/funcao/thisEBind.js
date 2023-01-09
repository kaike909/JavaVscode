const pontinhos = a => console.log(`${'-'.repeat(10)} ${a} ${'-'.repeat(10)}`)
pontinhos('this e bind() 1!')

const pessoa = {
    saudacao: 'Bom Dia!',
    falar(){
        console.log(this.saudacao)
    }
}

pessoa.falar()

const falar = pessoa.falar

falar() // conflito entre programação funcional e OO

const falarDePessoa = pessoa.falar.bind(pessoa)
falarDePessoa()

pontinhos('this e bind() 2!')

function Pessoa(){
    this.idade = 0

    const self = this;
    setInterval(function(){
        self.idade++
        console.log(self.idade)
    }/*.bind(this)*/, 1000)
}

new Pessoa