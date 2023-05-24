package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretProps

@Generated
public fun buildSecretProps(initializer: @AwsCdkDsl SecretProps.Builder.() -> Unit): SecretProps =
    SecretProps.Builder().apply(initializer).build()
