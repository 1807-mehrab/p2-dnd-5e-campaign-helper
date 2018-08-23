import EmberRouter from '@ember/routing/router';
import config from './config/environment';

const Router = EmberRouter.extend({
  location: config.locationType,
  rootURL: config.rootURL
});

Router.map(function() {
  this.route('homepage');
  this.route('createaccount');
  this.route('login');
  this.route('createchar');
  this.route('user');
  this.route('profile');
  this.route('post');
});

export default Router;
