@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

public
    fun crlConfigurationProperty(initializer: CfnCertificateAuthority.CrlConfigurationProperty.Builder.() -> Unit):
    CfnCertificateAuthority.CrlConfigurationProperty =
    CfnCertificateAuthority.CrlConfigurationProperty.builder().apply(initializer).build()
