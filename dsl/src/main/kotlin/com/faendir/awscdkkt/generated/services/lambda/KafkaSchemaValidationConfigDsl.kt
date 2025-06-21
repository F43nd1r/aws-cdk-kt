package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.KafkaSchemaValidationConfig

@Generated
public fun buildKafkaSchemaValidationConfig(initializer: @AwsCdkDsl
    KafkaSchemaValidationConfig.Builder.() -> Unit = {}): KafkaSchemaValidationConfig =
    KafkaSchemaValidationConfig.Builder().apply(initializer).build()
