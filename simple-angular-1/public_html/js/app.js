'use strict';

/**
 * @ngdoc overview
 * @name angularLab1App
 * @description
 * # angularLab1App
 *
 * Main module of the application.
 */


angular.module('testApp', [
    //'ngCookies',
    'ngResource',
    //'ngSanitize',
    'ngRoute',
    'testApp.filters',
    'testApp.directives'
])
        .config(function($routeProvider, $locationProvider) {
            $locationProvider.html5Mode(false);

            $routeProvider.when('/', {templateUrl: 'views/main.html', controller: 'MainCtrl'}
            );
        })
        .config(function($compileProvider) {
            $compileProvider.aHrefSanitizationWhitelist(/.*/g);
        });


angular.module('testApp.filters', []);
angular.module('testApp.directives', []);