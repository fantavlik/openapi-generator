/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.OpenApiPetstore);
  }
}(this, function(expect, OpenApiPetstore) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new OpenApiPetstore.TestEndpointParametersBody();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('TestEndpointParametersBody', function() {
    it('should create an instance of TestEndpointParametersBody', function() {
      // uncomment below and update the code to test TestEndpointParametersBody
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be.a(OpenApiPetstore.TestEndpointParametersBody);
    });

    it('should have the property integer (base name: "integer")', function() {
      // uncomment below and update the code to test the property integer
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property int32 (base name: "int32")', function() {
      // uncomment below and update the code to test the property int32
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property int64 (base name: "int64")', function() {
      // uncomment below and update the code to test the property int64
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property _number (base name: "number")', function() {
      // uncomment below and update the code to test the property _number
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property _float (base name: "float")', function() {
      // uncomment below and update the code to test the property _float
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property _double (base name: "double")', function() {
      // uncomment below and update the code to test the property _double
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property _string (base name: "string")', function() {
      // uncomment below and update the code to test the property _string
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property patternWithoutDelimiter (base name: "pattern_without_delimiter")', function() {
      // uncomment below and update the code to test the property patternWithoutDelimiter
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property _byte (base name: "byte")', function() {
      // uncomment below and update the code to test the property _byte
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property binary (base name: "binary")', function() {
      // uncomment below and update the code to test the property binary
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property _date (base name: "date")', function() {
      // uncomment below and update the code to test the property _date
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property dateTime (base name: "dateTime")', function() {
      // uncomment below and update the code to test the property dateTime
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property password (base name: "password")', function() {
      // uncomment below and update the code to test the property password
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

    it('should have the property callback (base name: "callback")', function() {
      // uncomment below and update the code to test the property callback
      //var instane = new OpenApiPetstore.TestEndpointParametersBody();
      //expect(instance).to.be();
    });

  });

}));
