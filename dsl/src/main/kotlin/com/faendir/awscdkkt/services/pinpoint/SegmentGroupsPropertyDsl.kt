package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnSegment

@Generated
public fun segmentGroupsProperty(initializer: CfnSegment.SegmentGroupsProperty.Builder.() -> Unit =
    {}): CfnSegment.SegmentGroupsProperty =
    CfnSegment.SegmentGroupsProperty.builder().apply(initializer).build()
