package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.EfsVolume

@Generated
public fun buildEfsVolume(initializer: @AwsCdkDsl EfsVolume.Builder.() -> Unit = {}): EfsVolume =
    EfsVolume.Builder.create().apply(initializer).build()
