package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnSegment

@Generated
public fun sourceSegmentsProperty(initializer: CfnSegment.SourceSegmentsProperty.Builder.() -> Unit
    = {}): CfnSegment.SourceSegmentsProperty =
    CfnSegment.SourceSegmentsProperty.builder().apply(initializer).build()
