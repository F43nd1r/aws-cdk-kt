package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.EmptyDirVolume

@Generated
public fun buildEmptyDirVolume(initializer: @AwsCdkDsl EmptyDirVolume.Builder.() -> Unit = {}): EmptyDirVolume = EmptyDirVolume.Builder.create().apply(initializer).build()
