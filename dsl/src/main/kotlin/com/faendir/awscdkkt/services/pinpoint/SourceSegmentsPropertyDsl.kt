@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnSegment

public
    fun sourceSegmentsProperty(initializer: CfnSegment.SourceSegmentsProperty.Builder.() -> Unit):
    CfnSegment.SourceSegmentsProperty =
    CfnSegment.SourceSegmentsProperty.builder().apply(initializer).build()
