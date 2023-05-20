@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig

public
    fun requiredClaimProperty(initializer: CfnIdentityProviderConfig.RequiredClaimProperty.Builder.() -> Unit):
    CfnIdentityProviderConfig.RequiredClaimProperty =
    CfnIdentityProviderConfig.RequiredClaimProperty.builder().apply(initializer).build()
