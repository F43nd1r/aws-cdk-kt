package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions

@Generated
public fun buildSecretRotationApplicationOptions(initializer: @AwsCdkDsl
    SecretRotationApplicationOptions.Builder.() -> Unit): SecretRotationApplicationOptions =
    SecretRotationApplicationOptions.Builder().apply(initializer).build()
