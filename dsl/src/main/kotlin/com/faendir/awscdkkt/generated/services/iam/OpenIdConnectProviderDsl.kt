package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.OpenIdConnectProvider
import software.amazon.awscdk.services.iam.OpenIdConnectProviderProps
import software.constructs.Construct

@Generated
public fun Construct.openIdConnectProvider(id: String, props: OpenIdConnectProviderProps):
    OpenIdConnectProvider = OpenIdConnectProvider(this, id, props)

@Generated
public fun Construct.openIdConnectProvider(
  id: String,
  props: OpenIdConnectProviderProps,
  initializer: @AwsCdkDsl OpenIdConnectProvider.() -> Unit,
): OpenIdConnectProvider = OpenIdConnectProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildOpenIdConnectProvider(id: String, initializer: @AwsCdkDsl
    OpenIdConnectProvider.Builder.() -> Unit): OpenIdConnectProvider =
    OpenIdConnectProvider.Builder.create(this, id).apply(initializer).build()
