import DS from 'ember-data';

export default DS.Model.extend({
	
	charStats:DS.attr('string'),
	character:DS.attr('string'),
	charSkills:DS.attr('string')
	

});
