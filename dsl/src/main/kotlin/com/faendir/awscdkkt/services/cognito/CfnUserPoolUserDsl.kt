@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
