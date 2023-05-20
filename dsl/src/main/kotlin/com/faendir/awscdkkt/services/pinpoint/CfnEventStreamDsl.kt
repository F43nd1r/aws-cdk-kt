@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnEventStream
import software.amazon.awscdk.services.pinpoint.CfnEventStreamProps
import software.constructs.Construct

public fun Construct.cfnEventStream(
  id: String,
  props: CfnEventStreamProps,
  initializer: CfnEventStream.() -> Unit = {},
): CfnEventStream = CfnEventStream(this, id, props).apply(initializer)
