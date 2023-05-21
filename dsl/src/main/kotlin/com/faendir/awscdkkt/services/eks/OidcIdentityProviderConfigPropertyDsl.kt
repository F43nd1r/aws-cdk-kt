package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig

@Generated
public
    fun oidcIdentityProviderConfigProperty(initializer: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.Builder.() -> Unit
    = {}): CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty =
    CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.builder().apply(initializer).build()
