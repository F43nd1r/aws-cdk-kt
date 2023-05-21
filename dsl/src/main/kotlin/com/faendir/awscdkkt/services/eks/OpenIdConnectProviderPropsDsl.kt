package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.OpenIdConnectProviderProps

@Generated
public fun openIdConnectProviderProps(initializer: OpenIdConnectProviderProps.Builder.() -> Unit =
    {}): OpenIdConnectProviderProps =
    OpenIdConnectProviderProps.builder().apply(initializer).build()
