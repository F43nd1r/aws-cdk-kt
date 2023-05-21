package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps

@Generated
public
    fun cfnIdentityProviderConfigProps(initializer: CfnIdentityProviderConfigProps.Builder.() -> Unit
    = {}): CfnIdentityProviderConfigProps =
    CfnIdentityProviderConfigProps.builder().apply(initializer).build()
