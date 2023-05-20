@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps
import software.constructs.Construct

public fun Construct.cfnUserPoolIdentityProvider(
  id: String,
  props: CfnUserPoolIdentityProviderProps,
  initializer: CfnUserPoolIdentityProvider.() -> Unit = {},
): CfnUserPoolIdentityProvider = CfnUserPoolIdentityProvider(this, id, props).apply(initializer)
