let addBtn = document.querySelector('.add-btn');
let subBtn = document.querySelector('.sub-btn');
let input1 = document.querySelector('.input1');
let input2 = document.querySelector('.input2');
addBtn.addEventListener('click', ()=>{
    
    let answer = document.querySelector('.answer-text');

    if( isNaN(input1.value) || isNaN(input2.value) || input1.value == '' || input2.value=='' )
    {
        alert('INVALID INPUT!');
    }
    else
    {
        let ans = Number(input1.value) + Number(input2.value);
        answer.innerText += ans ;
    }
} )

subBtn.addEventListener('click', ()=>{
    
    let answer = document.querySelector('.answer-text');

    if( isNaN(input1.value) || isNaN(input2.value) || input1.value == '' || input2.value=='' )
    {
        alert('INVALID INPUT!');
    }
    else
    {
        let ans = Number(input1.value) - Number(input2.value);
        answer.innerText += ans ;
    }
} )