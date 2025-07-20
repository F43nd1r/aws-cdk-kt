package com.faendir.awscdkkt.generated.services.route53recoveryreadiness

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRecoveryGroup(id: String, initializer: @AwsCdkDsl CfnRecoveryGroup.() -> Unit = {}): CfnRecoveryGroup = CfnRecoveryGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnRecoveryGroup(
  id: String,
  props: CfnRecoveryGroupProps,
  initializer: @AwsCdkDsl CfnRecoveryGroup.() -> Unit = {},
): CfnRecoveryGroup = CfnRecoveryGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRecoveryGroup(id: String, initializer: @AwsCdkDsl CfnRecoveryGroup.Builder.() -> Unit = {}): CfnRecoveryGroup = CfnRecoveryGroup.Builder.create(this, id).apply(initializer).build()
