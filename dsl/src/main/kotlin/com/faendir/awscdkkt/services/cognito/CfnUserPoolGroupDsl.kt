package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolGroup
import software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolGroup(
  id: String,
  props: CfnUserPoolGroupProps,
  initializer: CfnUserPoolGroup.() -> Unit = {},
): CfnUserPoolGroup = CfnUserPoolGroup(this, id, props).apply(initializer)
