// usando a notacao literal
const obj1 = {}
console.log(obj1);

// Objetxt em JS
console.log(typeof Object, typeof new Object);
const obj2 = new Object
console.log(obj2);

// Funcoes construtoras
function Produto(nome, preco, desc){
    this.nome = nome;
    this.getPrecoComDesconto = () => {
        return preco * (1 - desc);
    }
}

const p1 = new Produto('Caneta', 7.99, 0.15);
const p2 = new Produto('NoteBook', 2998.99, 0.25)

console.log(`R$ ${p1.getPrecoComDesconto().toFixed(2)}`);
console.log(`R$ ${p2.getPrecoComDesconto().toFixed(2)}`);

// Funcao Factory
function criarFuncionario(nome, salarioBase, faltas){
    return {
        nome, 
        salarioBase,
        faltas,
        getSalario() {
            return (salarioBase/30) * (30 - faltas)
        }
    }
}

const f1 = criarFuncionario('Joao', 7980, 4);
const f2 = criarFuncionario('Maria', 11400, 1);
console.log(f1.getSalario());
console.log(f2.getSalario());

// Object.create
const filha = Object.create(null);
filha.nome = 'Ana';
console.log(filha);

// Json.parse
const fromJSON = JSON.parse('{"info":"Sou um JSON object"}')
console.log(fromJSON.info);