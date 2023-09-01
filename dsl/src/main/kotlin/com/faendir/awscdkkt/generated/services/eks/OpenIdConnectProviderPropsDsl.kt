package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.OpenIdConnectProviderProps

@Generated
public fun buildOpenIdConnectProviderProps(initializer: @AwsCdkDsl
    OpenIdConnectProviderProps.Builder.() -> Unit = {}): OpenIdConnectProviderProps =
    OpenIdConnectProviderProps.Builder().apply(initializer).build()
