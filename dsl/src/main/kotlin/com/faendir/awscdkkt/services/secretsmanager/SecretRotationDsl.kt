@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretRotation
import software.amazon.awscdk.services.secretsmanager.SecretRotationProps
import software.constructs.Construct

public fun Construct.secretRotation(
  id: String,
  props: SecretRotationProps,
  initializer: SecretRotation.() -> Unit = {},
): SecretRotation = SecretRotation(this, id, props).apply(initializer)
