package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretStringGenerator

@Generated
public fun buildSecretStringGenerator(initializer: @AwsCdkDsl
    SecretStringGenerator.Builder.() -> Unit): SecretStringGenerator =
    SecretStringGenerator.Builder().apply(initializer).build()
