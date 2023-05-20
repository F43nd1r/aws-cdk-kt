@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesis

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.CfnStream

public
    fun streamModeDetailsProperty(initializer: CfnStream.StreamModeDetailsProperty.Builder.() -> Unit):
    CfnStream.StreamModeDetailsProperty =
    CfnStream.StreamModeDetailsProperty.builder().apply(initializer).build()
