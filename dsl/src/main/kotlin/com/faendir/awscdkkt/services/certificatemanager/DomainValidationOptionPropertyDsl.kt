@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.certificatemanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.CfnCertificate

public
    fun domainValidationOptionProperty(initializer: CfnCertificate.DomainValidationOptionProperty.Builder.() -> Unit):
    CfnCertificate.DomainValidationOptionProperty =
    CfnCertificate.DomainValidationOptionProperty.builder().apply(initializer).build()
