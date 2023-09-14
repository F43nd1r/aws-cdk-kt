package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.HostVolume

@Generated
public fun buildHostVolume(initializer: @AwsCdkDsl HostVolume.Builder.() -> Unit = {}): HostVolume =
    HostVolume.Builder.create().apply(initializer).build()
