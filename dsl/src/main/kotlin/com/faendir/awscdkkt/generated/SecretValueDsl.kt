package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.SecretValue

@Generated
public fun buildSecretValue(protectedValue: Any, initializer: @AwsCdkDsl
    SecretValue.Builder.() -> Unit): SecretValue =
    SecretValue.Builder.create(protectedValue).apply(initializer).build()
