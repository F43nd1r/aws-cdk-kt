@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
