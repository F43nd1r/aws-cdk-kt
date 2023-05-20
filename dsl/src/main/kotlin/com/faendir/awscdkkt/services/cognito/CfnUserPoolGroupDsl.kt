@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolGroup
import software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps
import software.constructs.Construct

public fun Construct.cfnUserPoolGroup(
  id: String,
  props: CfnUserPoolGroupProps,
  initializer: CfnUserPoolGroup.() -> Unit = {},
): CfnUserPoolGroup = CfnUserPoolGroup(this, id, props).apply(initializer)
