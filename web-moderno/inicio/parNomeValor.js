const pontinhos = a => console.log(`${'-'.repeat(10)} ${a} ${'-'.repeat(10)}`)
pontinhos('par Nome/Valor!')

const saudacao = 'Ola' // contexto léxico 1

function exec(){
    const saudacao = 'Falaaa' // contexto léxico 2
    return saudacao
}

// Objetos são grupos aninhados de pares nome/valor
const cliente = {
    nome: 'Almiro Souza',
    idade: 26,
    peso: 75,
    endereco: {
        logradouro: 'Rua Adomilro Alves Pereira',
        numero: 48,
        bairro: 'Jardim Euvira magalhães'
    }
}

console.log(saudacao)
console.log(exec())
console.log(`Meu nome é ${cliente.nome}, tenho ${cliente.idade}, peso ${cliente.peso}, moro na ${cliente.endereco.logradouro}, numero ${cliente.endereco.numero}, no bairro ${cliente.endereco.bairro}`)