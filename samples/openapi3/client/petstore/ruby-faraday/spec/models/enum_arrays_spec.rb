=begin
#OpenAPI Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.0.0-SNAPSHOT

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OpenapiClient::EnumArrays
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'EnumArrays' do
  before do
    # run before each test
    @instance = OpenapiClient::EnumArrays.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of EnumArrays' do
    it 'should create an instance of EnumArrays' do
      expect(@instance).to be_instance_of(OpenapiClient::EnumArrays)
    end
  end
  describe 'test attribute "just_symbol"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', [">=", "$"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.just_symbol = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "array_enum"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('Array<String>', ["fish", "crab"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.array_enum = value }.not_to raise_error
      # end
    end
  end

end
