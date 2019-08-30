const hero = document.querySelector('.hero');
const slider = document.querySelector('.slider');
const logo = document.querySelector('.logo');
const hamburger = document.querySelector('.hamburger');
const headline = document.querySelector('.headline');

const t1 = new TimelineMax();

t1.fromTo(hero, 1, {height:"0%"}, {height:'80%',  ease: Power2.easeInOut})
.fromTo(hero, 1.2 , {whidth:'100%'}, {whidth:'80%',  ease: Power2.easeInOut })
.fromTo(slider, 1.5, {x:"-100%"}, {x:"0%",  ease: Power2.easeInOut},"-=1.2")
.fromTo(logo, 0.5, {opacity: 0, x: 30}, {opacity:1,  x:0}, "-=0.5")
.fromTo(hamburger, 0.5, {opacity: 0, x: 30}, {opacity:1,  x:0}, "-=0.5")
.fromTo(headline, 0.5, {opacity: 0, x: 30}, {opacity:1,  x:0}, "-=0.5");

//---------------------------------------------------------------
var controle = 0;
function mudarcss() { 
    if(controle ==0){
    	document.getElementById("demo").style.background = "blue";
        controle++;
        }
    else{
    	document.getElementById("demo").style.background = "green";
        controle--;
        }
}

