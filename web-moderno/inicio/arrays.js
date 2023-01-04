var valores = [7.7, 8.9, 5.3]
const peso1 = 2.3;
const peso2 = 1.3;
const peso3 = 2;

for(let i = 0;i < valores.length;i++){
    if(i == 0){
        valores[i] = valores[i] * peso1;
    } else if(i == 1){
        valores[i] = valores[i] * peso2;
    } else if(i == 2){
        valores[i] = valores[i] * peso3;
    }
}

const mediaPeso = peso1 + peso2 + peso3;
let mediaGeral = 0;

for (let i = 0;i < valores.length;i++) {
    mediaGeral = mediaGeral + valores[i]
}

mediaGeral = mediaGeral / 3;

console.log(valores)
console.log(mediaGeral)

var array = [7, 6, 3, 9 ]
//array[7] = 8
//delete array.pop()
//console.log(array)
console.log(array)
console.log(typeof array)