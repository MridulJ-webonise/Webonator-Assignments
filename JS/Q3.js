let startbtn = document.querySelector('.start-btn');
let endbtn = document.querySelector('.end-btn');

startbtn.addEventListener( 'click', ()=> openTabs() );

function openTabs( n )
{
    let tabarr=[];
    let openInt = setInterval(() => {
        tabarr.push( window.open( "https://google.com") );
    }, 2000);
    
    let i=0;
    let closeInt = setInterval(() => {
        tabarr[i].close();
        ++i;
    }, 3000);
    
    endbtn.addEventListener( 'click', ()=>{
        clearInterval(openInt);
        clearInterval(closeInt); 
    } )

}
