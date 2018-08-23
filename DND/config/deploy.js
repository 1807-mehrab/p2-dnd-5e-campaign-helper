
module.exports = function(deployTarget) {
  let ENV = {
    build: {
    environment: deployTarget
 },
   'revision-data': {
      type: 'git-commit'
    }
  };
   
  return ENV;
};
