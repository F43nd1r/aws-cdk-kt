package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.Secret
import software.amazon.awscdk.services.secretsmanager.SecretProps
import software.constructs.Construct

@Generated
public fun Construct.secret(id: String, props: SecretProps): Secret = Secret(this, id, props)

@Generated
public fun Construct.secret(
  id: String,
  props: SecretProps,
  initializer: @AwsCdkDsl Secret.() -> Unit,
): Secret = Secret(this, id, props).apply(initializer)

@Generated
public fun Construct.secret(id: String): Secret = Secret(this, id)

@Generated
public fun Construct.secret(id: String, initializer: @AwsCdkDsl Secret.() -> Unit): Secret =
    Secret(this, id).apply(initializer)

@Generated
public fun Construct.buildSecret(id: String, initializer: @AwsCdkDsl Secret.Builder.() -> Unit):
    Secret = Secret.Builder.create(this, id).apply(initializer).build()
