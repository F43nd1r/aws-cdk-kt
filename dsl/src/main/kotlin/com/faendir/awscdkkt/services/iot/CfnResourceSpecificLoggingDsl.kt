package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnResourceSpecificLogging
import software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceSpecificLogging(
  id: String,
  props: CfnResourceSpecificLoggingProps,
  initializer: CfnResourceSpecificLogging.() -> Unit = {},
): CfnResourceSpecificLogging = CfnResourceSpecificLogging(this, id, props).apply(initializer)
