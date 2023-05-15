package com.twinkles.harrypotterproject.service;

import com.twinkles.harrypotterproject.dto.HouseDto;
import com.twinkles.harrypotterproject.dto.WizardDto;
import com.twinkles.harrypotterproject.repository.MasterHouseRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MasterHouseService {

	private final MasterHouseRepository masterHouseRepository;

	public List<HouseDto> retreiveAll() {
		return masterHouseRepository
				.findAll().parallelStream().map(house -> HouseDto.builder().id(house.getId())
						.createdAt(house.getCreatedAt()).name(house.getName()).updatedAt(house.getUpdatedAt()).build())
				.collect(Collectors.toList());
	}

	@Cacheable(value = "wizards", key = "#houseId")
	public List<WizardDto> retreiveWizardsByHouseId(final UUID houseId) {
		final var house = masterHouseRepository.findById(houseId).get();
		return house.getWizards().parallelStream()
				.map(wizard -> WizardDto.builder().createdAt(wizard.getCreatedAt()).firstName(wizard.getFirstName())
						.gender(wizard.getGender()).houseId(wizard.getHouseId()).id(wizard.getId())
						.lastName(wizard.getLastName()).middleName(wizard.getMiddleName())
						.updatedAt(wizard.getUpdatedAt()).build())
				.collect(Collectors.toList());
	}

}
