package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnLogging
import software.amazon.awscdk.services.iot.CfnLoggingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLogging(
  id: String,
  props: CfnLoggingProps,
  initializer: CfnLogging.() -> Unit = {},
): CfnLogging = CfnLogging(this, id, props).apply(initializer)
