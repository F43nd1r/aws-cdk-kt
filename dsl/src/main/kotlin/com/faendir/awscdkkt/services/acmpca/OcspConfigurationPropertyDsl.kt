@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

public
    fun ocspConfigurationProperty(initializer: CfnCertificateAuthority.OcspConfigurationProperty.Builder.() -> Unit):
    CfnCertificateAuthority.OcspConfigurationProperty =
    CfnCertificateAuthority.OcspConfigurationProperty.builder().apply(initializer).build()
