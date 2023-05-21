package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificate

@Generated
public
    fun customExtensionProperty(initializer: CfnCertificate.CustomExtensionProperty.Builder.() -> Unit
    = {}): CfnCertificate.CustomExtensionProperty =
    CfnCertificate.CustomExtensionProperty.builder().apply(initializer).build()
