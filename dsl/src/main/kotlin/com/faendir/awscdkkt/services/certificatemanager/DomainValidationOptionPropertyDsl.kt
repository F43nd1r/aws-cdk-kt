package com.faendir.awscdkkt.services.certificatemanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.CfnCertificate

@Generated
public
    fun domainValidationOptionProperty(initializer: CfnCertificate.DomainValidationOptionProperty.Builder.() -> Unit
    = {}): CfnCertificate.DomainValidationOptionProperty =
    CfnCertificate.DomainValidationOptionProperty.builder().apply(initializer).build()
