@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.Secret
import software.amazon.awscdk.services.secretsmanager.SecretProps
import software.constructs.Construct

public fun Construct.secret(
  id: String,
  props: SecretProps,
  initializer: Secret.() -> Unit = {},
): Secret = Secret(this, id, props).apply(initializer)

public fun Construct.secret(id: String, initializer: Secret.() -> Unit = {}): Secret = Secret(this,
    id).apply(initializer)
