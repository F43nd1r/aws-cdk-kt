package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.HostPathVolume

@Generated
public fun buildHostPathVolume(initializer: @AwsCdkDsl HostPathVolume.Builder.() -> Unit = {}): HostPathVolume = HostPathVolume.Builder.create().apply(initializer).build()
