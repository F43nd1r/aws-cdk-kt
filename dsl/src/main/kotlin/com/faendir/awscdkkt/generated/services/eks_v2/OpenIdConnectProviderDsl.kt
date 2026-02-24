@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.eks_v2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.eks_v2.OpenIdConnectProvider
import software.amazon.awscdk.services.eks_v2.OpenIdConnectProviderProps
import software.constructs.Construct

@Deprecated(message = "software.amazon.awscdk.services.eks_v2.OpenIdConnectProvider is deprecated in CDK.")
@Generated
public fun Construct.openIdConnectProvider(
  id: String,
  props: OpenIdConnectProviderProps,
  initializer: @AwsCdkDsl OpenIdConnectProvider.() -> Unit = {},
): OpenIdConnectProvider = OpenIdConnectProvider(this, id, props).apply(initializer)

@Deprecated(message = "software.amazon.awscdk.services.eks_v2.OpenIdConnectProvider is deprecated in CDK.")
@Generated
public fun Construct.buildOpenIdConnectProvider(id: String, initializer: @AwsCdkDsl OpenIdConnectProvider.Builder.() -> Unit = {}): OpenIdConnectProvider = OpenIdConnectProvider.Builder.create(this, id).apply(initializer).build()
