package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ScalableTaskCountProps

@Generated
public fun scalableTaskCountProps(initializer: ScalableTaskCountProps.Builder.() -> Unit = {}):
    ScalableTaskCountProps = ScalableTaskCountProps.builder().apply(initializer).build()
