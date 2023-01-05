const pontinhos = a => console.log(`${'-'.repeat(10)} ${a} ${'-'.repeat(10)}`)
pontinhos('Objetos 1!')
const prod1 = {};
prod1.nome = 'Celular Top';
prod1.preco = 4999.99;
prod1['Besconto Legal'] = 0.40

console.log(`O ${prod1.nome} está custando R$ ${prod1.preco}`);
console.log(prod1)

const prod2 = {
    nome: 'Notebook',
    preco: 3499.90,
    obj:{
        blabla: 1,
        obj:{
            blabla: 2
        }
    }
}

console.log(prod2)

//array e concat
var arr1 = ['a', 'b', 'c'];
var arr2 = ['d', 'e', 'f'];
var arr3 = ['g', 'h', 'i'];

const result = arr1.concat(arr2, arr3)
console.log(`Todas as variáveis dão o resultado ${result}`)

pontinhos('Objetos 2!')

console.log(typeof Object)
console.log(typeof new Object)

const Cliente = function(){}
console.log(typeof Cliente)
console.log(typeof new Cliente)

class Produto{}
console.log(typeof Produto)
console.log(typeof new Produto)