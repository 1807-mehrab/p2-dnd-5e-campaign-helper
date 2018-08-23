define('dnd/router', ['exports', 'dnd/config/environment'], function (exports, _environment) {
  'use strict';

  Object.defineProperty(exports, "__esModule", {
    value: true
  });


  const Router = Ember.Router.extend({
    location: _environment.default.locationType,
    rootURL: _environment.default.rootURL
  });

  Router.map(function () {
    this.route('homepage');
    this.route('createaccount');
    this.route('login');
    this.route('createchar');
  });

  exports.default = Router;
});