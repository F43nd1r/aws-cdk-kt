@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53recoveryreadiness

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps
import software.constructs.Construct

public fun Construct.cfnRecoveryGroup(id: String, initializer: CfnRecoveryGroup.() -> Unit = {}):
    CfnRecoveryGroup = CfnRecoveryGroup(this, id).apply(initializer)

public fun Construct.cfnRecoveryGroup(
  id: String,
  props: CfnRecoveryGroupProps,
  initializer: CfnRecoveryGroup.() -> Unit = {},
): CfnRecoveryGroup = CfnRecoveryGroup(this, id, props).apply(initializer)
