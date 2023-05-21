package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.Secret
import software.amazon.awscdk.services.secretsmanager.SecretProps
import software.constructs.Construct

@Generated
public fun Construct.secret(id: String, initializer: Secret.() -> Unit = {}): Secret = Secret(this,
    id).apply(initializer)

@Generated
public fun Construct.secret(
  id: String,
  props: SecretProps,
  initializer: Secret.() -> Unit = {},
): Secret = Secret(this, id, props).apply(initializer)
