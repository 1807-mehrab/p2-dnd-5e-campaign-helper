import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | createchar', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:createchar');
    assert.ok(route);
  });
});
