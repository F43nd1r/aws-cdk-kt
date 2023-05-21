package com.faendir.awscdkkt.services.evidently

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnLaunch

@Generated
public fun groupToWeightProperty(initializer: CfnLaunch.GroupToWeightProperty.Builder.() -> Unit =
    {}): CfnLaunch.GroupToWeightProperty =
    CfnLaunch.GroupToWeightProperty.builder().apply(initializer).build()
