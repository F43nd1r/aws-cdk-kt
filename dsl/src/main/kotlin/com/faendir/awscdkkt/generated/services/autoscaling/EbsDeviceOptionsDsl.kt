package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.EbsDeviceOptions

@Generated
public fun buildEbsDeviceOptions(initializer: @AwsCdkDsl EbsDeviceOptions.Builder.() -> Unit = {}):
    EbsDeviceOptions = EbsDeviceOptions.Builder().apply(initializer).build()
