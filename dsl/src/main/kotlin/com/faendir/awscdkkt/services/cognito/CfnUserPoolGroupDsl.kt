@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
