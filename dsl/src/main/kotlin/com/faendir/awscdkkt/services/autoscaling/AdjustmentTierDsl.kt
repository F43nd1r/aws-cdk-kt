package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.AdjustmentTier

@Generated
public fun adjustmentTier(initializer: AdjustmentTier.Builder.() -> Unit = {}): AdjustmentTier =
    AdjustmentTier.builder().apply(initializer).build()
