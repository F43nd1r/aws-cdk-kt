@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

public
    fun revocationConfigurationProperty(initializer: CfnCertificateAuthority.RevocationConfigurationProperty.Builder.() -> Unit):
    CfnCertificateAuthority.RevocationConfigurationProperty =
    CfnCertificateAuthority.RevocationConfigurationProperty.builder().apply(initializer).build()
