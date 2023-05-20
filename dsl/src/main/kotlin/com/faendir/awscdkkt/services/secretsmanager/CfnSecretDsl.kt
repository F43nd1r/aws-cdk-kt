@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnSecret
import software.amazon.awscdk.services.secretsmanager.CfnSecretProps
import software.constructs.Construct

public fun Construct.cfnSecret(id: String, initializer: CfnSecret.() -> Unit = {}): CfnSecret =
    CfnSecret(this, id).apply(initializer)

public fun Construct.cfnSecret(
  id: String,
  props: CfnSecretProps,
  initializer: CfnSecret.() -> Unit = {},
): CfnSecret = CfnSecret(this, id, props).apply(initializer)
