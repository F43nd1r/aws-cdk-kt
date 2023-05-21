package com.faendir.awscdkkt.services.evidently

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnLaunch

@Generated
public fun segmentOverrideProperty(initializer: CfnLaunch.SegmentOverrideProperty.Builder.() -> Unit
    = {}): CfnLaunch.SegmentOverrideProperty =
    CfnLaunch.SegmentOverrideProperty.builder().apply(initializer).build()
