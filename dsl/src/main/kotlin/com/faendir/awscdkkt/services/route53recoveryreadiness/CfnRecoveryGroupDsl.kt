@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53recoveryreadiness

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps
import software.constructs.Construct

public fun Construct.cfnRecoveryGroup(
  id: String,
  props: CfnRecoveryGroupProps,
  initializer: CfnRecoveryGroup.() -> Unit = {},
): CfnRecoveryGroup = CfnRecoveryGroup(this, id, props).apply(initializer)

public fun Construct.cfnRecoveryGroup(id: String, initializer: CfnRecoveryGroup.() -> Unit = {}):
    CfnRecoveryGroup = CfnRecoveryGroup(this, id).apply(initializer)
