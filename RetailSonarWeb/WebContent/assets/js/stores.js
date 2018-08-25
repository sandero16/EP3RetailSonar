/**
 * 
 */

var resultLat = "lat: ";
    var resultLng = "lng: ";
    var resultTot = "";
    var resp = {lat: 51.0543422, lng: 3.717424299999948};
    var map;
    var pos;
      function initMap() {
    	  
    	var mapOptions = {
    			zoom: 8,
    	          center: {lat: 50.83, lng: 4.35},
    	          mapTypeId: google.maps.MapTypeId.roadmap,
    	  	    clickableIcons:false,
    	  	    disableDoubleClickZoom:true,
    	  	    draggable:false,
    	  	    fullscreenControl:false,
    	  	    keyboardShortcuts:false,
    	  	    mapTypeControl:false,
    	  	    panControl:false,
    	  	    rotateControl:false,
    	  	    scaleControl:false,
    	  	    scrollwheel:false,
    	  	    streetViewControl:false,
    	  	    zoomControl:false,		
    	};
        map = new google.maps.Map(document.getElementById('map'), mapOptions);
        var geocoder = new google.maps.Geocoder();
        
        
        

        
        document.getElementById('submit').addEventListener('click', function() {
          geocodeAddress(geocoder, map);
        });
        
        document.getElementById('nearbyS').addEventListener('click', function() {
           nearBySearch();
        	//test();  
        });
        
      }
	  
      function geocodeAddress(geocoder, resultsMap) {
    	  map = resultsMap;
    	  var space =" ";
    	    var straat = document.getElementById('straat').value;
    	    var nummer = document.getElementById('nummer').value;
    	    var postcode = document.getElementById('postcode').value;
    	    var gemeente = document.getElementById('gemeente').value;
          var address = straat.concat(space).concat(nummer).concat(space).concat(gemeente);
        geocoder.geocode({'address': address}, function(results, status) {
          if (status === 'OK') {
            resultsMap.setCenter(results[0].geometry.location);
            pos = results[0].geometry.location;
            var marker = new google.maps.Marker({
              map: resultsMap,
              position: results[0].geometry.location,
              
            });
            resultsMap.setZoom(15);
            
          } 
        });
      }        
      function nearBySearch(){
    	  var mapOptions = {
      			zoom: 15,
      	          center: pos,
      	          mapTypeId: google.maps.MapTypeId.roadmap,
      	  	    clickableIcons:false,
      	  	    disableDoubleClickZoom:true,
      	  	    draggable:false,
      	  	    fullscreenControl:false,
      	  	    keyboardShortcuts:false,
      	  	    mapTypeControl:false,
      	  	    panControl:false,
      	  	    rotateControl:false,
      	  	    scaleControl:false,
      	  	    scrollwheel:false,
      	  	    streetViewControl:false,
      	  	    zoomControl:false,		
      	};
    	  map = new google.maps.Map(document.getElementById('map'), mapOptions);
    	  var service = new google.maps.places.PlacesService(map);
    	  infowindow = new google.maps.InfoWindow();
		  service.nearbySearch({
	          location: pos,
	          radius: 500,
	          type: ['supermarket', 'store']
	        }, call);
	  }
      function callback(results, status) {
        if (status === google.maps.places.PlacesServiceStatus.OK) {
          for (var i = 0; i < results.length; i++) {
            createMarker(results[i]);
          }
          var marker = new google.maps.Marker({
              map: map,
              position: pos,
              
            });
        }
      }

      function createMarker(place) {
        var placeLoc = place.geometry.location;
        var marker = new google.maps.Marker({
          map: map,
          position: place.geometry.location
        });

        google.maps.event.addListener(marker, 'click', function() {
          infowindow.setContent(place.name);
          infowindow.open(map, this);
        });
      }
      function call(results, status) {
    	  var body = document.getElementById('storesNearBy');
    	  var tb1 = document.createElement('table');
    	  var tbdy = document.createElement('tbody');
    	  
          if (status === google.maps.places.PlacesServiceStatus.OK) {
        	  
            for (var i = 0; i < results.length; i++) {
              createMarker(results[i]);
              var tr = document.createElement('tr');
              var td = document.createElement('td');
              td.appendChild(document.createTextNode(results[i].name));
              tr.appendChild(td);
              tbdy.appendChild(tr);
              
            }
            tb1.appendChild(tbdy);
            body.appendChild(tb1);
         }
          
    }
      function test(){
    	  var body = document.getElementById('storesNearBy');
    	  
    	  var tb1 = document.createElement('table');
    	  var tbdy = document.createElement('tbody');
    	  
          //if (status === google.maps.places.PlacesServiceStatus.OK) {
            for (var i = 0; i < 4; i++) {
              var tr = document.createElement('tr');
              var td = document.createElement('td');
              td.appendChild(document.createTextNode(i));
              tr.appendChild(td);
              tbdy.appendChild(tr);
            }
            
            tb1.appendChild(tbdy);
            body.appendChild(tb1);
            //window.alert("check4");
            
         //}
          
      }
