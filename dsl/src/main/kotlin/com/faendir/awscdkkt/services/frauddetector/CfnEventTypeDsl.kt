@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.frauddetector

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnEventType
import software.amazon.awscdk.services.frauddetector.CfnEventTypeProps
import software.constructs.Construct

public fun Construct.cfnEventType(
  id: String,
  props: CfnEventTypeProps,
  initializer: CfnEventType.() -> Unit = {},
): CfnEventType = CfnEventType(this, id, props).apply(initializer)
