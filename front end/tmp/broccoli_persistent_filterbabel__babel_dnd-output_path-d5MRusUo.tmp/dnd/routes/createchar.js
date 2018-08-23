define('dnd/routes/createchar', ['exports'], function (exports) {
   'use strict';

   Object.defineProperty(exports, "__esModule", {
      value: true
   });
   exports.default = Ember.Route.extend({
      model() {
         return [{
            id: 'placeholder'

         }];
      }

   });
});