define('dnd/components/roll-dice', ['exports'], function (exports) {
    'use strict';

    Object.defineProperty(exports, "__esModule", {
        value: true
    });
    exports.default = Ember.Component.extend({

        actions: {

            rolldice() {

                sides: 6, function () {
                    var randomNumber = Math.floor(Math.random() * this.sides) + 1;
                    var placeholder = document.getElementById('placeholder');
                    placeholder.innerHTML = randomNumber;
                    return randomNumber;
                };
            }

        }

    });
});