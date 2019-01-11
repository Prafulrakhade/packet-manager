package io.mosip.registration.processor.core.packet.dto.demographicinfo.identify;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * Instantiates a new identity.
 */
@Data
@Component
public class Identity {

	/** The name. */
	private IdentityJsonValues name;

	/** The gender. */
	private IdentityJsonValues gender;

	/** The dob. */
	private IdentityJsonValues dob;

	/** The pheonitic name. */
	private IdentityJsonValues pheoniticName;

	/** The poa. */
	private IdentityJsonValues poa;

	/** The por. */
	private IdentityJsonValues por;

	/** The poi. */
	private IdentityJsonValues poi;

	/** The pob. */
	private IdentityJsonValues pob;

}
