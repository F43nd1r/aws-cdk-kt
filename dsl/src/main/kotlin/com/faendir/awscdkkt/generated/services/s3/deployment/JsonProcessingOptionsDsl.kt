package com.faendir.awscdkkt.generated.services.s3.deployment

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.JsonProcessingOptions

@Generated
public fun buildJsonProcessingOptions(initializer: @AwsCdkDsl
    JsonProcessingOptions.Builder.() -> Unit = {}): JsonProcessingOptions =
    JsonProcessingOptions.Builder().apply(initializer).build()
