package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnSegment

@Generated
public
    fun segmentDimensionsProperty(initializer: CfnSegment.SegmentDimensionsProperty.Builder.() -> Unit
    = {}): CfnSegment.SegmentDimensionsProperty =
    CfnSegment.SegmentDimensionsProperty.builder().apply(initializer).build()
