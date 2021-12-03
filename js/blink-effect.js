//Blink settings
var blink = {
    obj: $(".blink"),
    timeout: 150000,
    speed: 900
};

//Start function
blink.fn = setInterval(function () {
    blink.obj.fadeToggle(blink.speed);
}, blink.speed + 1);

//Ends blinking, after 'blink.timeout' millisecons
setTimeout(function () {
    clearInterval(blink.fn);
    //Ensure that the element is always visible
    blink.obj.fadeIn(blink.speed);
    blink = null;
}, blink.timeout);