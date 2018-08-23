define('dnd/tests/app.lint-test', [], function () {
  'use strict';

  QUnit.module('ESLint | app');

  QUnit.test('app.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'app.js should pass ESLint\n\n');
  });

  QUnit.test('components/roll-dice.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'components/roll-dice.js should pass ESLint\n\n11:5 - \'sides:\' is defined but never used. (no-unused-labels)');
  });

  QUnit.test('resolver.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'resolver.js should pass ESLint\n\n');
  });

  QUnit.test('router.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'router.js should pass ESLint\n\n');
  });

  QUnit.test('routes/createaccount.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/createaccount.js should pass ESLint\n\n');
  });

  QUnit.test('routes/createchar.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/createchar.js should pass ESLint\n\n');
  });

  QUnit.test('routes/homepage.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/homepage.js should pass ESLint\n\n');
  });

  QUnit.test('routes/index.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/index.js should pass ESLint\n\n');
  });

  QUnit.test('routes/login.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/login.js should pass ESLint\n\n');
  });
});