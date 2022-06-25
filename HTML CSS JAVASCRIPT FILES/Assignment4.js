function fact(k) {
    let flag = 1;
    if (k == 0 || k == 1) {
        return 1;
    } else {
        for (var i = k; i >= 1; i--) {
            flag = flag * i;
        }
        return flag;
    }
}
let n = 5;
console.log("The factorial of " + n + " is " + fact(n));

function factr(num, n = 1) {
    if (num) {
        return factr(num - 1, n * num)
    }
    return n

}
console.log(factr(5))

function freq(n, digits) {
    var k = 0
    var rev, rem;
    while (n != 0) {
        rem = n % 10
        rev = rev * 10 + rem
        n = Math.floor(n / 10)
        if (digits == rem) {
            k = k + 1
        }
    }
    return k;
}

function freq2() {
    value = '24654616354';
    console.log()
    var i;
    for (i = 0; i < 10; i++) {
        console.log("Number", i, ":", freq(value, i))
    }
}
//freq2();
module.exports - freq2

//var s = "A string to count in a haste enviourment."

function stro(s) {
    var i, j;
    var st = 0;
    let ns = [];
    //console.log(s[0].toLowerCase())
    s = s.replace(/\s/g, '');
    for (let i = 0; i < s.length; i++) {
        if (s[i] != " " && ns.includes(s[i]) == false) {
            ns[i] = s[i].toLowerCase()
            console.log(ns[i])
        }
    }
    for (j = 0; j < ns.length; j++) {
        // if (typeof(s[j].toLowerCase) === 'string') {
        //     ns[j] = s[j].toLowerCase()
        // }
        for (i = 0; i < s.length; i++) {
            if (s[i] != " " && ns[j] != " ") {
                if (ns[j] === s[i].toLowerCase()) {
                    //console.log(s[i])
                    st = st + 1
                }
            }
        }
        // if (ns[j] === undefined) {

        // } else {
        //     console.log(ns[j] + ": " + st)
        // }
        console.log(ns[j] + ": " + st)
        st = 0
    }
}
//stro("A string of strings")

function rs1(str) {
    str = str.split(' ').reverse().join(' ')
    console.log(str)
}
//rs1('Reverse words of this string')

function rs2(str) {
    str = str.split('').reverse().join('').split(' ').reverse().join(' ')
    console.log(str)
}
//rs2('Reverse words')

function rs3(str) {
    str = str.split('').reverse().join('')
    console.log(str)
}

//rs3('Reverse words')


function char(str) {
    let st = new Array(58);
    let fr = [];
    for (let i = 0; i < st.length; i++) {
        st[i] = 0;

    }

    for (let i = 0; i < str.length; i++) {
        st[str.charCodeAt(i) - 65]++
    }

    for (let i = 0; i < st.length; i++) {
        if (st[i] != 0 && !(i > 25 && i < 33)) {
            console.log(String.fromCharCode(i + 65) + ": " + st[i])
        }
    }

}
char("A simpleAAA CodE adkadjk adjakdad akda dkaduy a ikudad a dA yhk , A h , [][][]_______")