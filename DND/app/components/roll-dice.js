import Component from '@ember/component';

export default Component.extend({



actions:{

    rolldice(){

    sides: 6,
    function() {
    var randomNumber = Math.floor(Math.random() * this.sides) + 1;
    var placeholder = document.getElementById('placeholder');
    placeholder.innerHTML = randomNumber;
    return randomNumber;
}





}

}



});
