@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.OpenIdConnectProvider
import software.amazon.awscdk.services.iam.OpenIdConnectProviderProps
import software.constructs.Construct

public fun Construct.openIdConnectProvider(
  id: String,
  props: OpenIdConnectProviderProps,
  initializer: OpenIdConnectProvider.() -> Unit = {},
): OpenIdConnectProvider = OpenIdConnectProvider(this, id, props).apply(initializer)
