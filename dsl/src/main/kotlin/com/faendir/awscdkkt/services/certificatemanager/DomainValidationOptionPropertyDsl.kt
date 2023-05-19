@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.certificatemanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.CfnCertificate

public
    fun domainValidationOptionProperty(initializer: CfnCertificate.DomainValidationOptionProperty.Builder.() -> Unit):
    CfnCertificate.DomainValidationOptionProperty =
    CfnCertificate.DomainValidationOptionProperty.builder().apply(initializer).build()
