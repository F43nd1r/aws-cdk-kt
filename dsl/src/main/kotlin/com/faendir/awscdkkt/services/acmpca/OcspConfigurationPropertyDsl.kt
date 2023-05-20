@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

public
    fun ocspConfigurationProperty(initializer: CfnCertificateAuthority.OcspConfigurationProperty.Builder.() -> Unit):
    CfnCertificateAuthority.OcspConfigurationProperty =
    CfnCertificateAuthority.OcspConfigurationProperty.builder().apply(initializer).build()
