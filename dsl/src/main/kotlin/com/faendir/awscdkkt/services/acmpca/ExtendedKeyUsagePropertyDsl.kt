package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificate

@Generated
public
    fun extendedKeyUsageProperty(initializer: CfnCertificate.ExtendedKeyUsageProperty.Builder.() -> Unit
    = {}): CfnCertificate.ExtendedKeyUsageProperty =
    CfnCertificate.ExtendedKeyUsageProperty.builder().apply(initializer).build()
