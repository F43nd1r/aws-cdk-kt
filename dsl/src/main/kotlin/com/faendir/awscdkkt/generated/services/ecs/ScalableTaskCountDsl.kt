package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ScalableTaskCount
import software.amazon.awscdk.services.ecs.ScalableTaskCountProps
import software.constructs.Construct

@Generated
public fun Construct.scalableTaskCount(
  id: String,
  props: ScalableTaskCountProps,
  initializer: @AwsCdkDsl ScalableTaskCount.() -> Unit = {},
): ScalableTaskCount = ScalableTaskCount(this, id, props).apply(initializer)

@Generated
public fun Construct.buildScalableTaskCount(id: String, initializer: @AwsCdkDsl
    ScalableTaskCount.Builder.() -> Unit = {}): ScalableTaskCount =
    ScalableTaskCount.Builder.create(this, id).apply(initializer).build()
