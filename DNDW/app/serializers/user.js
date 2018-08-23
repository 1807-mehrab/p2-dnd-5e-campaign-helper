import DS from 'ember-data';

export default DS.RESTSerializer.extend({
	
	primaryKey: 'email',
	
	normalizeResponse(store, primaryModelClass, payload, id, requestType) {
		//console.log(payload);
		payload = { 'User': payload };
		return this._super(store, primaryModelClass, payload, id, requestType);
	}
});
