/*Hide Inspect Element
document.addEventListener("contextmenu",function(body){body.preventDefault();});
/*Hide Inspect Element*/



    var swiper = new Swiper('.swiper-container', {
      effect: 'coverflow',
        speed:1500,
      grabCursor: true,
      centeredSlides: true,
      slidesPerView: 'auto',
      coverflowEffect: {
        rotate: 70,
        stretch: 0,
        depth: 400,
        modifier: 0.89,
        slideShadows : true,
      },
        
        loop: true,
        autoplay: {
        delay: 2500,
        disableOnInteraction: false,
      },
        parallax: true,
      pagination: {
        el: '.swiper-pagination',
          clickable: true,
      },
    });











/*post-wrapper*/
$(document).ready(function(){
  	$('#one').slick({
     	slidesToShow: 3,
  		slidesToScroll: 1,
  		autoplay: false,
  		autoplaySpeed: 2000,
		nextArrow: $('#next1'),
		prevArrow: $('#prev1'),
		responsive: [
    		{
      		breakpoint: 1024,
      		settings: {
        		slidesToShow: 3,
        		slidesToScroll: 3,
     			infinite: true,
        		dots: true
      			}
    		},
			{
      		breakpoint: 992,
      		settings: {
        		slidesToShow: 2,
        		slidesToScroll: 2
      			}
    		},
			{
     		breakpoint: 768,
      		settings: {
        		slidesToShow: 1,
        		slidesToScroll: 1
      			}
    		},
    
    // You can unslick at a given breakpoint now by adding:
    // settings: "unslick"
    // instead of a settings object
  		]
 	 });
	
	
	$('#two').slick({
     	slidesToShow: 2.7,
 		 slidesToScroll: 1,
 		 autoplay: false,
  		autoplaySpeed: 2000,
		nextArrow: $('#next2'),
		prevArrow: $('#prev2'),
		responsive: [
    		{
      		breakpoint: 1024,
      		settings: {
        		slidesToShow: 3,
        		slidesToScroll: 3,
     			infinite: true,
        		dots: true
      			}
    		},
			{
      		breakpoint: 992,
      		settings: {
        		slidesToShow: 2,
        		slidesToScroll: 2
      			}
    		},
			{
     		breakpoint: 768,
      		settings: {
        		slidesToShow: 1,
        		slidesToScroll: 1
      			}
    		},
    
    // You can unslick at a given breakpoint now by adding:
    // settings: "unslick"
    // instead of a settings object
  		]
  });
	
	
	
	
$('#three').slick({
     	slidesToShow: 2.7,
 		 slidesToScroll: 1,
 		 autoplay: false,
  		autoplaySpeed: 2000,
		nextArrow: $('#next3'),
		prevArrow: $('#prev3'),
		responsive: [
    		{
      		breakpoint: 1024,
      		settings: {
        		slidesToShow: 3,
        		slidesToScroll: 3,
     			infinite: true,
        		dots: true
      			}
    		},
			{
      		breakpoint: 992,
      		settings: {
        		slidesToShow: 2,
        		slidesToScroll: 2
      			}
    		},
			{
     		breakpoint: 768,
      		settings: {
        		slidesToShow: 1,
        		slidesToScroll: 1
      			}
    		},
    
    // You can unslick at a given breakpoint now by adding:
    // settings: "unslick"
    // instead of a settings object
  		]
  });
	
	
	
	
$('#four').slick({
		centerMode: true,
  		centerPadding: '50px',
     	slidesToShow: 3.65,
 		 slidesToScroll: 1,
 		 autoplay: false,
  		autoplaySpeed: 2000,
		nextArrow: $('#next4'),
		prevArrow: $('#prev4'),
		responsive: [
			{
		  		breakpoint: 1199,
		  		settings: {
					arrows: false,
					centerMode: true,
					centerPadding: '10px',
					slidesToShow: 3.3,
					slidesToScroll: 3,
			 		infinite: true,
					dots: true
			  		}
			},
      		{
        		breakpoint: 1024,
        		settings: {
          			slidesToShow: 3,
          			slidesToScroll: 3,
          			infinite: true,
          			dots: true,
        			},
      		},
      		{
        		breakpoint: 992,
     			settings: {
          			slidesToShow: 2,
          			slidesToScroll: 2,
        			},
      		},
      		{
        		breakpoint: 768,
        		settings: {
					arrows: false,
					centerMode: true,
					centerPadding: '-100px',
          			slidesToShow: 1.7,
          			slidesToScroll: 1,
        			},
      		},

      // You can unslick at a given breakpoint now by adding:
      // settings: "unslick"
      // instead of a settings object
    	],
	});
	
	
	
	
	
});
/*post-wrapper*/





/*post-wrapper*/
/*$('.post-wrapper').slick({
  slidesToShow: 3,
  slidesToScroll: 1,
  autoplay: false,
  autoplaySpeed: 2000,
	nextArrow: $('.next'),
	prevArrow: $('.prev'),
	responsive: [
    {
      breakpoint: 1024,
      settings: {
        slidesToShow: 3,
        slidesToScroll: 3,
        infinite: true,
        dots: true
      }
    },
	{
      breakpoint: 992,
      settings: {
        slidesToShow: 2,
        slidesToScroll: 2
      }
    },
		{
      breakpoint: 768,
      settings: {
        slidesToShow: 1,
        slidesToScroll: 1
      }
    },
    
    // You can unslick at a given breakpoint now by adding:
    // settings: "unslick"
    // instead of a settings object
  ]
});
/*post-wrapper*/



/*covid-19 */

async function getcovidapi(){
		
	
	const jsondata = await fetch('https://api.covid19india.org/data.json');
	const jsdata = await jsondata.json();
	
	
	const length1 = jsdata.cases_time_series.length-1;
	const casestimeseries = jsdata.cases_time_series[length1];
	const {date} = casestimeseries;
	
	const statewise = jsdata.statewise[0];
	const {confirmed} = statewise;
	const number_confirmed = new Intl.NumberFormat('en-IN').format(confirmed)
	const {deltaconfirmed} = statewise;
	const number_deltaconfirmed = new Intl.NumberFormat('en-IN').format(deltaconfirmed)
	const {active} = statewise;
	const number_active = new Intl.NumberFormat('en-IN').format(active)
	const {recovered} = statewise;
	const number_recovered = new Intl.NumberFormat('en-IN').format(recovered)
	const {deltarecovered} = statewise;
	const number_deltarecovered = new Intl.NumberFormat('en-IN').format(deltarecovered)
	const {deaths} = statewise;
	const number_deaths = new Intl.NumberFormat('en-IN').format(deaths)
	const {deltadeaths} = statewise;
	const number_deltadeaths = new Intl.NumberFormat('en-IN').format(deltadeaths)
	var {lastupdatedtime} = statewise;
	
	const length2 = jsdata.tested.length-1;
	const tested = jsdata.tested[length2];
	const {samplereportedtoday} = tested;
	const number_samplereportedtoday = new Intl.NumberFormat('en-IN').format(samplereportedtoday)
	const {totalsamplestested} = tested;
	const number_totalsamplestested = new Intl.NumberFormat('en-IN').format(totalsamplestested)
	
	
	
	document.getElementById('date').innerHTML = date;
	
	document.getElementById('confirmed').innerHTML = number_confirmed;
	document.getElementById('deltaconfirmed').textContent = number_deltaconfirmed;
	document.getElementById('active').innerHTML = number_active;
	document.getElementById('recovered').innerHTML = number_recovered;
	document.getElementById('deltarecovered').textContent = number_deltarecovered;
	document.getElementById('deaths').innerHTML = number_deaths;
	document.getElementById('deltadeaths').textContent = number_deltadeaths;
	document.getElementById('lastupdatedtime').innerHTML = lastupdatedtime;
	
	document.getElementById('samplereportedtoday').innerHTML = number_samplereportedtoday;
	document.getElementById('totalsamplestested').innerHTML = number_totalsamplestested;
	
	

	
	jQuery(function ($) {
    "use strict";
    
    var counterUp = window.counterUp["default"]; // import counterUp from "counterup2"
    
    var $counters = $(".realtime-count");
    
    // Start counting, do this on DOM ready or with Waypoints.
    $counters.each(function (ignore, counter) {
        counterUp(counter, {
            duration: 2000,
            delay: 2
        });
    });
    
});
	/*$('.realtime-count').each(function () {
    $(this).prop('Counter',0).animate({
        Counter: $(this).text()
    }, {
        duration: 4000,
        easing: 'swing',
        step: function (now) {
            $(this).text(Math.ceil(now));
        }
    });
});
/*const el = document.querySelector( '.realtime-count' )

// Start counting, do this on DOM ready or with Waypoints.
counterUp( el, {
    duration: 1000,
    delay: 16,
} )
	/*auto counter
		$('.realtime-count').counterUp({
    		delay: 10,
    		time: 1000
		});
	auto counter*/
	//console.log(new Intl.DateTimeFormat('de-DE', options).format(date2));
	
}
getcovidapi();





$(document).ready(function () {
  // Get JSON data from url
  $.getJSON("https://api.covid19india.org/data.json", function (data) {

	var states = [];
    var confirmed = [];
    var recovered = [];
    var deaths = [];
	var date = [];
	var dailyconfirmed = [];
	var dailyrecovered = [];
	var dailydeceased = [];
	//var updatetimestamp = [];
	var totalsamplestested = [];
	let formatedDates = [];
	  
	  
	// The each loop select a single statewise array element
    // Take the data in that array and add it to variables
	$.each(data.cases_time_series, function (id, obj) {
      date.push(obj.date);
      dailyconfirmed.push(obj.dailyconfirmed);
	  dailyrecovered.push(obj.dailyrecovered);
	  dailydeceased.push(obj.dailydeceased);
    });
	  
	  
    $.each(data.statewise, function (id, obj) {
      states.push(obj.state);
      confirmed.push(obj.confirmed);
      recovered.push(obj.recovered);
      deaths.push(obj.deaths);
    });
	  
	  
	 $.each(data.tested, function (id, obj) {
	  formatedDates.push(formatDate(obj.updatetimestamp));
	  //updatetimestamp.push(obj.updatetimestamp);
	  totalsamplestested.push(obj.totalsamplestested);
    });
	  //console.log(formatedDates);
	  //console.log(updatetimestamp);
	  
	states.shift();
    confirmed.shift();
    recovered.shift();
    deaths.shift(); 
	  
	// Chart initialization
    var myChart = document.getElementById("myChart").getContext("2d");
    var chart = new Chart(myChart, {
      type: "line",
      data: {
        labels: states,
        datasets: [
          {
            label: "Confirmed Cases",
            data: confirmed,
            backgroundColor: "rgba(255,17,16,0.71)",
            minBarLength: 100,
          },
          {
            label: "Recovered",
            data: recovered,
            backgroundColor: "rgba(84,199,30,0.71)",
            minBarLength: 100,
          },
          {
            label: "Deceased",
            data: deaths,
            backgroundColor: "rgba(143,143,143,0.71)",
            minBarLength: 100,
          },
        ],
      },
      option: {},
    });
	  
	  
	// Chart initialization2
    var myChart2 = document.getElementById("myChart2").getContext("2d");
    var chart = new Chart(myChart2, {
      type: "line",
      data: {
        labels: date,
		
        datasets: [
          {
            label: "Daily Confirmed",
            data: dailyconfirmed,
            backgroundColor: "rgba(255,17,16,0.71)",
            minBarLength: 5,
			  //fill: true,
          },
        ],
      },
      option: {},
    });
	  
	  
	// Chart initialization3
    var myChart3 = document.getElementById("myChart3").getContext("2d");
    var chart = new Chart(myChart3, {
      type: "line",
      data: {
        labels: date,
        datasets: [
          {
            label: "Daily Recovered",
            data: dailyrecovered,
            backgroundColor: "rgba(84,199,30,0.71)",
            minBarLength: 5,
          },
        ],
      },
      option: {},
    });
	  
	 
	// Chart initialization4
    var myChart4 = document.getElementById("myChart4").getContext("2d");
    var chart = new Chart(myChart4, {
      type: "line",
      data: {
        labels: date,
        datasets: [
          {
            label: "Daily Deceased",
            data: dailydeceased,
            backgroundColor: "rgba(143,143,143,0.71)",
            minBarLength: 5,
          },
        ],
      },
      option: {},
    });
	  
	  
	// Chart initialization5
    var myChart5 = document.getElementById("myChart5").getContext("2d");
    var chart = new Chart(myChart5, {
      type: "line",
      data: {
        labels: formatedDates,
        datasets: [
          {
            label: "Total Samples Tested",
            data: totalsamplestested,
            backgroundColor: "rgba(110,15,205,0.71)",
            minBarLength: 5,
          },
        ],
      },
      options: {
		  //responsive: true,
		  //maintainAspectRatio: true,
	  },
    });
	  
  });
})

//format dates
const monthsNames = ['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec']
function formatDate(datestring){
	let tempdate = datestring.split(" ");
	tempdate = tempdate[0];
	let newdate = tempdate.split('/').reverse().join("-");
	let date = new Date(newdate);
	return date.getDate()+ " " +monthsNames[date.getMonth()];
	//return '${date.getDate()} ${monthsNames[date.getMonth()]}';
}

/*covid-19 */
