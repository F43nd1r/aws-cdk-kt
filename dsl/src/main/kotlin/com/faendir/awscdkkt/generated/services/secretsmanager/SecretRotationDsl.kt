package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretRotation
import software.amazon.awscdk.services.secretsmanager.SecretRotationProps
import software.constructs.Construct

@Generated
public fun Construct.secretRotation(
  id: String,
  props: SecretRotationProps,
  initializer: @AwsCdkDsl SecretRotation.() -> Unit = {},
): SecretRotation = SecretRotation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSecretRotation(id: String, initializer: @AwsCdkDsl
    SecretRotation.Builder.() -> Unit = {}): SecretRotation = SecretRotation.Builder.create(this,
    id).apply(initializer).build()
