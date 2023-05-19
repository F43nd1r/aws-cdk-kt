@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ScalableTaskCount
import software.amazon.awscdk.services.ecs.ScalableTaskCountProps
import software.constructs.Construct

public fun Construct.scalableTaskCount(
  id: String,
  props: ScalableTaskCountProps,
  initializer: ScalableTaskCount.() -> Unit = {},
): ScalableTaskCount = ScalableTaskCount(this, id, props).apply(initializer)
