package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier

@Generated
public fun adjustmentTier(initializer: AdjustmentTier.Builder.() -> Unit = {}): AdjustmentTier =
    AdjustmentTier.builder().apply(initializer).build()
