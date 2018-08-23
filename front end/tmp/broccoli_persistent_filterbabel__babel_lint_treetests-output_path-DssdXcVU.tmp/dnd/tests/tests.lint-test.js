define('dnd/tests/tests.lint-test', [], function () {
  'use strict';

  QUnit.module('ESLint | tests');

  QUnit.test('integration/components/roll-dice-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/roll-dice-test.js should pass ESLint\n\n');
  });

  QUnit.test('test-helper.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'test-helper.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/createaccount-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/createaccount-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/createchar-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/createchar-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/homepage-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/homepage-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/index-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/index-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/login-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/login-test.js should pass ESLint\n\n');
  });
});