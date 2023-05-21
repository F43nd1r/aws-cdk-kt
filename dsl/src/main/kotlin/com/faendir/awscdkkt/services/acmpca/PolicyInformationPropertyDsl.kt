package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificate

@Generated
public
    fun policyInformationProperty(initializer: CfnCertificate.PolicyInformationProperty.Builder.() -> Unit
    = {}): CfnCertificate.PolicyInformationProperty =
    CfnCertificate.PolicyInformationProperty.builder().apply(initializer).build()
