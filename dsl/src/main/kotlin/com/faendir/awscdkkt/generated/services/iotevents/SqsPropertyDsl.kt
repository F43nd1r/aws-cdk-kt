package com.faendir.awscdkkt.generated.services.iotevents

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@Generated
public fun buildSqsProperty(initializer: @AwsCdkDsl CfnDetectorModel.SqsProperty.Builder.() -> Unit
    = {}): CfnDetectorModel.SqsProperty =
    CfnDetectorModel.SqsProperty.Builder().apply(initializer).build()
