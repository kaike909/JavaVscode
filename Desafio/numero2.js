function fibonacci(n) {
    if (n === 0) return [0];
    if (n === 1) return [0,1];

    let f = fibonacci(n - 1);
    f.push(f[f.length - 1] + f[f.length - 2]);

    return f;
}

console.log(fibonacci(8)); // Saida [ 0, 1,  1,  2, 3, 5, 8, 13, 21 ]