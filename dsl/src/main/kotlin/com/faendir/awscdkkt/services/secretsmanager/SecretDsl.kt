@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.Secret
import software.amazon.awscdk.services.secretsmanager.SecretProps
import software.constructs.Construct

public fun Construct.secret(id: String, initializer: Secret.() -> Unit = {}): Secret = Secret(this,
    id).apply(initializer)

public fun Construct.secret(
  id: String,
  props: SecretProps,
  initializer: Secret.() -> Unit = {},
): Secret = Secret(this, id, props).apply(initializer)
