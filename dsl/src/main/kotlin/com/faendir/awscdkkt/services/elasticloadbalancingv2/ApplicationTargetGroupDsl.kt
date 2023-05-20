@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps
import software.constructs.Construct

public fun Construct.applicationTargetGroup(
  id: String,
  props: ApplicationTargetGroupProps,
  initializer: ApplicationTargetGroup.() -> Unit = {},
): ApplicationTargetGroup = ApplicationTargetGroup(this, id, props).apply(initializer)

public fun Construct.applicationTargetGroup(id: String,
    initializer: ApplicationTargetGroup.() -> Unit = {}): ApplicationTargetGroup =
    ApplicationTargetGroup(this, id).apply(initializer)
