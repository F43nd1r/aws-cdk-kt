package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig

@Generated
public
    fun requiredClaimProperty(initializer: CfnIdentityProviderConfig.RequiredClaimProperty.Builder.() -> Unit
    = {}): CfnIdentityProviderConfig.RequiredClaimProperty =
    CfnIdentityProviderConfig.RequiredClaimProperty.builder().apply(initializer).build()
