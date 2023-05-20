@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.signer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.signer.CfnSigningProfile

public
    fun signatureValidityPeriodProperty(initializer: CfnSigningProfile.SignatureValidityPeriodProperty.Builder.() -> Unit):
    CfnSigningProfile.SignatureValidityPeriodProperty =
    CfnSigningProfile.SignatureValidityPeriodProperty.builder().apply(initializer).build()
