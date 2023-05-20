@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
