@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolUser
import software.amazon.awscdk.services.cognito.CfnUserPoolUserProps
import software.constructs.Construct

public fun Construct.cfnUserPoolUser(
  id: String,
  props: CfnUserPoolUserProps,
  initializer: CfnUserPoolUser.() -> Unit = {},
): CfnUserPoolUser = CfnUserPoolUser(this, id, props).apply(initializer)
