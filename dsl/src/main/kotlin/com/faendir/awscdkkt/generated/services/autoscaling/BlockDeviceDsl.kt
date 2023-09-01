package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.BlockDevice

@Generated
public fun buildBlockDevice(initializer: @AwsCdkDsl BlockDevice.Builder.() -> Unit = {}):
    BlockDevice = BlockDevice.Builder().apply(initializer).build()
