package com.faendir.awscdkkt.services.route53recoveryreadiness

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRecoveryGroup(id: String, initializer: CfnRecoveryGroup.() -> Unit = {}):
    CfnRecoveryGroup = CfnRecoveryGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnRecoveryGroup(
  id: String,
  props: CfnRecoveryGroupProps,
  initializer: CfnRecoveryGroup.() -> Unit = {},
): CfnRecoveryGroup = CfnRecoveryGroup(this, id, props).apply(initializer)
