'use strict';

/**
 * @ngdoc function
 * @name angularLab1App.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the angularLab1App
 */


angular.module('testApp').controller('MainCtrl', function($scope, $resource, $log) {

    $scope.myModel = {something: "mycontent"};
    $scope.errorMsg = false;

});
