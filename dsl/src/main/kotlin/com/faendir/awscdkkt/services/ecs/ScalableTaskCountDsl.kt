package com.faendir.awscdkkt.services.ecs

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
  initializer: ScalableTaskCount.() -> Unit = {},
): ScalableTaskCount = ScalableTaskCount(this, id, props).apply(initializer)
