package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnSecret
import software.amazon.awscdk.services.secretsmanager.CfnSecretProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecret(id: String, initializer: @AwsCdkDsl CfnSecret.() -> Unit = {}): CfnSecret = CfnSecret(this, id).apply(initializer)

@Generated
public fun Construct.cfnSecret(
  id: String,
  props: CfnSecretProps,
  initializer: @AwsCdkDsl CfnSecret.() -> Unit = {},
): CfnSecret = CfnSecret(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecret(id: String, initializer: @AwsCdkDsl CfnSecret.Builder.() -> Unit = {}): CfnSecret = CfnSecret.Builder.create(this, id).apply(initializer).build()
