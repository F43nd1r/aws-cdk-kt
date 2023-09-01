package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretRotationProps

@Generated
public fun buildSecretRotationProps(initializer: @AwsCdkDsl SecretRotationProps.Builder.() -> Unit =
    {}): SecretRotationProps = SecretRotationProps.Builder().apply(initializer).build()
