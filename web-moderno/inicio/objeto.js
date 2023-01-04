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