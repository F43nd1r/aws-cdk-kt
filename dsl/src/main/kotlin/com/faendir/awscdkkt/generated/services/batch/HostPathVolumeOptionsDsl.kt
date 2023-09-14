package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.HostPathVolumeOptions

@Generated
public fun buildHostPathVolumeOptions(initializer: @AwsCdkDsl
    HostPathVolumeOptions.Builder.() -> Unit = {}): HostPathVolumeOptions =
    HostPathVolumeOptions.Builder().apply(initializer).build()
