@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnLogging
import software.amazon.awscdk.services.iot.CfnLoggingProps
import software.constructs.Construct

public fun Construct.cfnLogging(
  id: String,
  props: CfnLoggingProps,
  initializer: CfnLogging.() -> Unit = {},
): CfnLogging = CfnLogging(this, id, props).apply(initializer)
