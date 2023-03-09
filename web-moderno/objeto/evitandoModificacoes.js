// Object.preventExtensions
const produto = Object.preventExtensions({
    nome: 'Qualquer',
    preco: 1.99,
    tag: 'Promocao'
})

console.log('Extensivel:', Object.isExtensible(produto));

produto.nome = 'Borracha';
produto.descricao = 'Borracha escolar branca';
delete produto.tag;

console.log(produto);

// Object.seal
const pessoa = {
    nome: 'Juliana',
    idade: 35
}

Object.seal(pessoa);
pessoa.eCasada = true
console.log('selado', Object.isSealed(pessoa));
pessoa.nome = 'Carlos';
pessoa.idade = 26;
console.log(pessoa);