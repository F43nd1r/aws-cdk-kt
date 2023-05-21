package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.OpenIdConnectProviderProps

@Generated
public fun openIdConnectProviderProps(initializer: OpenIdConnectProviderProps.Builder.() -> Unit =
    {}): OpenIdConnectProviderProps =
    OpenIdConnectProviderProps.builder().apply(initializer).build()
