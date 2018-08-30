import DS from 'ember-data';

export default DS.RESTSerializer.extend({
	normalizeResponse(store, primanyModelClass, payload, id, requestType){
		payload = {logins: payload};
		
		return this._super(store, primanyModelClass, payload, id, requestType );
	}
});
