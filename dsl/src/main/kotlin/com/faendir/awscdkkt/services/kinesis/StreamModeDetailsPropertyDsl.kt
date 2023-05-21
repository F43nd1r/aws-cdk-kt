package com.faendir.awscdkkt.services.kinesis

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.CfnStream

@Generated
public
    fun streamModeDetailsProperty(initializer: CfnStream.StreamModeDetailsProperty.Builder.() -> Unit
    = {}): CfnStream.StreamModeDetailsProperty =
    CfnStream.StreamModeDetailsProperty.builder().apply(initializer).build()
