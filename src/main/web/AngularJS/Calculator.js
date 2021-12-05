    var app = angular.module('Calculator', []);
    app.controller('divCtrlInitial', function($scope, $http) {

        $scope.NGM_tbVisor = 0;

        $scope.NGC_bt = function(val) {
            if ($scope.NGM_tbVisor == 0) {
                $scope.NGM_tbVisor = val;
            } else {
                $scope.NGM_tbVisor = $scope.NGM_tbVisor + val.toString();
            }
        };

        $scope.NGC_btLimpar = function() {
            $scope.NGM_tbVisor = 0;
        };





        $scope.NGC_btIgual = function(visor) {
            var req = {
                method: 'POST',
                url: 'http://localhost:8080/calculator/Do',
                headers: {
                    'Content-Type': 'application/json'
                },
                data: { 'visor': "teste" }
            }
            $http(req).success(function(response) { $scope.NGM_tbVisor = "teste"; });

        };


    });