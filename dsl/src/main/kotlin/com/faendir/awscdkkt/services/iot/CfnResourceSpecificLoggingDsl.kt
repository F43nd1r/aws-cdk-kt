@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
