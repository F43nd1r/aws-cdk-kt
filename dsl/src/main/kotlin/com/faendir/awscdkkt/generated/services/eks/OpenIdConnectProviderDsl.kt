package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.OpenIdConnectProvider
import software.amazon.awscdk.services.eks.OpenIdConnectProviderProps
import software.constructs.Construct

@Generated
public fun Construct.openIdConnectProvider(
  id: String,
  props: OpenIdConnectProviderProps,
  initializer: @AwsCdkDsl OpenIdConnectProvider.() -> Unit = {},
): OpenIdConnectProvider = OpenIdConnectProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildOpenIdConnectProvider(id: String, initializer: @AwsCdkDsl
    OpenIdConnectProvider.Builder.() -> Unit = {}): OpenIdConnectProvider =
    OpenIdConnectProvider.Builder.create(this, id).apply(initializer).build()
