package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.applicationTargetGroup(id: String, initializer: @AwsCdkDsl ApplicationTargetGroup.() -> Unit = {}): ApplicationTargetGroup = ApplicationTargetGroup(this, id).apply(initializer)

@Generated
public fun Construct.applicationTargetGroup(
  id: String,
  props: ApplicationTargetGroupProps,
  initializer: @AwsCdkDsl ApplicationTargetGroup.() -> Unit = {},
): ApplicationTargetGroup = ApplicationTargetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildApplicationTargetGroup(id: String, initializer: @AwsCdkDsl ApplicationTargetGroup.Builder.() -> Unit = {}): ApplicationTargetGroup = ApplicationTargetGroup.Builder.create(this, id).apply(initializer).build()
