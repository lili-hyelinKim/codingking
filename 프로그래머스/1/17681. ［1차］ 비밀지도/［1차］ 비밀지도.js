function solution(n, arr1, arr2) {    
    const setBinary = num => num.toString(2).padStart(n, '0');

    for(let i=0; i<n; i++){        
        arr1[i] = setBinary(arr1[i]);
        arr2[i] = setBinary(arr2[i]);
    }

    return arr1.reduce((a, c, i)=>{        
        let value = '';
        Array.prototype.forEach.call(c, (str, j)=>{  
            (+str || +arr2[i][j]) ? value += '#' : value += ' ';            
        });
        a[i] = value;
        return a;
    }, []);    
}