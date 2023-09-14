package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.EmptyDirVolumeOptions

@Generated
public fun buildEmptyDirVolumeOptions(initializer: @AwsCdkDsl
    EmptyDirVolumeOptions.Builder.() -> Unit = {}): EmptyDirVolumeOptions =
    EmptyDirVolumeOptions.Builder().apply(initializer).build()
