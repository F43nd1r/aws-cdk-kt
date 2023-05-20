@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig

public
    fun oidcIdentityProviderConfigProperty(initializer: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.Builder.() -> Unit):
    CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty =
    CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.builder().apply(initializer).build()
