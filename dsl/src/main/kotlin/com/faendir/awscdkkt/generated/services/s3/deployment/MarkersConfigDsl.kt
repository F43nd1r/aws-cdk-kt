package com.faendir.awscdkkt.generated.services.s3.deployment

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.MarkersConfig

@Generated
public fun buildMarkersConfig(initializer: @AwsCdkDsl MarkersConfig.Builder.() -> Unit = {}):
    MarkersConfig = MarkersConfig.Builder().apply(initializer).build()
