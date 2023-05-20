@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnResourceSpecificLogging
import software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps
import software.constructs.Construct

public fun Construct.cfnResourceSpecificLogging(
  id: String,
  props: CfnResourceSpecificLoggingProps,
  initializer: CfnResourceSpecificLogging.() -> Unit = {},
): CfnResourceSpecificLogging = CfnResourceSpecificLogging(this, id, props).apply(initializer)
