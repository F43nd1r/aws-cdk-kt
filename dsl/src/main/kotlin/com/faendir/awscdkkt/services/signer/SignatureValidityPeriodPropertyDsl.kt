package com.faendir.awscdkkt.services.signer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.signer.CfnSigningProfile

@Generated
public
    fun signatureValidityPeriodProperty(initializer: CfnSigningProfile.SignatureValidityPeriodProperty.Builder.() -> Unit
    = {}): CfnSigningProfile.SignatureValidityPeriodProperty =
    CfnSigningProfile.SignatureValidityPeriodProperty.builder().apply(initializer).build()
