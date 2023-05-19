@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificate

public
    fun extendedKeyUsageProperty(initializer: CfnCertificate.ExtendedKeyUsageProperty.Builder.() -> Unit):
    CfnCertificate.ExtendedKeyUsageProperty =
    CfnCertificate.ExtendedKeyUsageProperty.builder().apply(initializer).build()
