@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.evidently

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnSegment
import software.amazon.awscdk.services.evidently.CfnSegmentProps
import software.constructs.Construct

public fun Construct.cfnSegment(
  id: String,
  props: CfnSegmentProps,
  initializer: CfnSegment.() -> Unit = {},
): CfnSegment = CfnSegment(this, id, props).apply(initializer)
