@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.mediaconnect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource
import software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps
import software.constructs.Construct

public fun Construct.cfnFlowSource(
  id: String,
  props: CfnFlowSourceProps,
  initializer: CfnFlowSource.() -> Unit = {},
): CfnFlowSource = CfnFlowSource(this, id, props).apply(initializer)
