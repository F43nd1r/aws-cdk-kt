package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificate

@Generated
public fun validityProperty(initializer: CfnCertificate.ValidityProperty.Builder.() -> Unit = {}):
    CfnCertificate.ValidityProperty =
    CfnCertificate.ValidityProperty.builder().apply(initializer).build()
