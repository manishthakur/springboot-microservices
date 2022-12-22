package net.javaguides.organizationservice.service;

import net.javaguides.organizationservice.dto.OrganizationDto;
import net.javaguides.organizationservice.entity.Organization;

public interface OrganizationService {

    OrganizationDto saveOrganizationDto(OrganizationDto organizationDto);

    OrganizationDto getOrganizationByCode(String organizationCode);


}
