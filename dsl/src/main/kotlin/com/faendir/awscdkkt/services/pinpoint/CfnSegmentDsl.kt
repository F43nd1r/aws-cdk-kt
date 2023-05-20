@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnSegment
import software.amazon.awscdk.services.pinpoint.CfnSegmentProps
import software.constructs.Construct

public fun Construct.cfnSegment(
  id: String,
  props: CfnSegmentProps,
  initializer: CfnSegment.() -> Unit = {},
): CfnSegment = CfnSegment(this, id, props).apply(initializer)
