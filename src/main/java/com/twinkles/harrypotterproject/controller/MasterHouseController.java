package com.twinkles.harrypotterproject.controller;

import com.twinkles.harrypotterproject.dto.HouseDto;
import com.twinkles.harrypotterproject.dto.WizardDto;
import com.twinkles.harrypotterproject.service.MasterHouseService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/house")
@AllArgsConstructor
public class MasterHouseController {

	private final MasterHouseService masterHouseService;

	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	@Operation(summary = "Returns list of houses")
	public ResponseEntity<List<HouseDto>> masterHouseListRetreivalHandler() {
		return ResponseEntity.ok(masterHouseService.retreiveAll());
	}

	@GetMapping(value = "/{houseId}/wizards/all", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	@Operation(summary = "Returns list of wizards of provided house-id")
	public ResponseEntity<List<WizardDto>> wizardsByHouseRetreivalHandler(
			@PathVariable(name = "houseId", required = true) final UUID houseId) {
		return ResponseEntity.ok(masterHouseService.retreiveWizardsByHouseId(houseId));
	}
}
