package com.example.propertyListing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.propertyListing.model.Property;
import com.example.propertyListing.repository.PropertiesRepository;

@RestController
@CrossOrigin(origins = "*")
public class PropertiesController {
	
	@Autowired
	PropertiesRepository propertiesRepository;

	// Fetch all properties
	@GetMapping("/propertiesall")
	public List<Property> getPropertiesAll() {
		return (List<Property>) propertiesRepository.findAll();
	}

	// Fetch properties by location
	@GetMapping("/propertybylocation/{locationId}")
	public List<Property> getPropertyByCity(@PathVariable int locationId) {
		return (List<Property>) propertiesRepository.findByLocationId(locationId);
	}

}

/*<div class="footer-dark ftr">
<footer>
<div class="container pt-5">
    <div class="row">
        <div class="col-sm-6 col-md-3 item">
            <h3 class="px-2 hd">Services</h3>
            <ul class="nav flex-column col1">
                <li class="py-1 nav-item">
                    <a class="nav-link text-muted" href="#">BUY</a>
                </li>
                <li class="py-1 nav-item">
                    <a class="nav-link text-muted" href="#">RENT</a>
                </li>
                <li class="py-1 nav-item">
                    <a class="nav-link text-muted" href="#">Rent Apartment</a>
                </li>
            </ul>
        </div>
        <div>
            <h3 class="px-2 hd">About</h3>
            <ul class="nav flex-column col1">
                <li class="py-1 nav-item">
                    <a class="nav-link text-muted" href="#">Company</a>
                </li>
                <li class="py-1 nav-item">
                    <a class="nav-link text-muted" href="#">Reviews</a>
                </li>
                <li class="py-1 nav-item">
                    <a class="nav-link text-muted" href="#">Locate Us</a>
                </li>
            </ul>
        </div>
        <div class="col-md-6">
            <h3 class="hd">
                Property Listing
            </h3>
            <p class="py-2 text-muted">
                Search for amazing properties in India, the best property site. Sell, Rent exclusive houses, apartments, villas at reasonable price.
            </p>
        </div>

    </div>
    </div>
</footer>

</div>
*/