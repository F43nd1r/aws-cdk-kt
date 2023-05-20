@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
