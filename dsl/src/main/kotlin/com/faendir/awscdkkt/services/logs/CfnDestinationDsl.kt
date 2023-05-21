package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnDestination
import software.amazon.awscdk.services.logs.CfnDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDestination(
  id: String,
  props: CfnDestinationProps,
  initializer: CfnDestination.() -> Unit = {},
): CfnDestination = CfnDestination(this, id, props).apply(initializer)
