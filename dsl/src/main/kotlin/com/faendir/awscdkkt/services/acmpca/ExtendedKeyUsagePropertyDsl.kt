@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificate

public
    fun extendedKeyUsageProperty(initializer: CfnCertificate.ExtendedKeyUsageProperty.Builder.() -> Unit):
    CfnCertificate.ExtendedKeyUsageProperty =
    CfnCertificate.ExtendedKeyUsageProperty.builder().apply(initializer).build()
