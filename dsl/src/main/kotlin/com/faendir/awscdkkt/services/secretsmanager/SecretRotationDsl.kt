package com.faendir.awscdkkt.services.secretsmanager

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
  initializer: SecretRotation.() -> Unit = {},
): SecretRotation = SecretRotation(this, id, props).apply(initializer)
