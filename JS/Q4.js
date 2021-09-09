let body = document.querySelector('body');
let submitbtn = document.querySelector('.submit-btn');
let displaybtn = document.querySelector('.display-btn');
let namevalue = document.querySelector('.name');
let emailvalue = document.querySelector('.email');
let form = document.querySelector('form');
let errmsg = document.querySelector('.err-msg')
submitbtn.addEventListener( 'click', ()=>{
    if( namevalue.value == "" || emailvalue.value == "" || !emailvalue.value.includes("@") )
    {
        errmsg.innerText = 'Invalid Inputs';
        setTimeout(() => {
            errmsg.innerText = '';
        }, 2000);
        
    }
    else{
        if( sessionStorage.length == 0 )
        {
            sessionStorage.setItem( "name", namevalue.value );
            sessionStorage.setItem( "email", emailvalue.value );
            sessionStorage.setItem( "time", new Date() );
        }
        else
        {
            sessionStorage.setItem( "name", sessionStorage.getItem("name") + "," +namevalue.value );
            sessionStorage.setItem( "email", sessionStorage.getItem("email") + "," +emailvalue.value );
            sessionStorage.setItem( "time", sessionStorage.getItem("time") + "," +new Date());
        }
    }
} )

displaybtn.addEventListener('click', ()=>{
    
    let t = document.querySelector('table');

    console.log( sessionStorage.length )
    if(t)
    {
        t.remove();
    }
    let table = document.createElement('table');
    table.classList.add('.table')
    table.innerHTML = `<tr>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Date</th>
                        </tr>`
    if( sessionStorage.length > 1 )
    {
        let names = sessionStorage.getItem('name').split(",");
        let emails = sessionStorage.getItem('email').split(",");
        let dates = sessionStorage.getItem('time').split(",");
        console.log(names);
        for( let i=1; i<names.length; ++i )
        {
            let row = document.createElement('tr');
            row.innerHTML = `<td>${names[i]}</td>
                            <td>${emails[i]}</td>
                            <td>${dates[i]}</td>`;
            table.appendChild(row);
        }
    }

    body.appendChild(table);
})