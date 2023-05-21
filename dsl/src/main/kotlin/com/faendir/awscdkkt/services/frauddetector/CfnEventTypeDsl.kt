package com.faendir.awscdkkt.services.frauddetector

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnEventType
import software.amazon.awscdk.services.frauddetector.CfnEventTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventType(
  id: String,
  props: CfnEventTypeProps,
  initializer: CfnEventType.() -> Unit = {},
): CfnEventType = CfnEventType(this, id, props).apply(initializer)
