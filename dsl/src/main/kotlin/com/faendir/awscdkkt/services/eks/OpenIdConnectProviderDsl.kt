@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.OpenIdConnectProvider
import software.amazon.awscdk.services.eks.OpenIdConnectProviderProps
import software.constructs.Construct

public fun Construct.openIdConnectProvider(
  id: String,
  props: OpenIdConnectProviderProps,
  initializer: OpenIdConnectProvider.() -> Unit = {},
): OpenIdConnectProvider = OpenIdConnectProvider(this, id, props).apply(initializer)
