@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.route53recoveryreadiness

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck
import software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps
import software.constructs.Construct

public fun Construct.cfnReadinessCheck(id: String, initializer: CfnReadinessCheck.() -> Unit = {}):
    CfnReadinessCheck = CfnReadinessCheck(this, id).apply(initializer)

public fun Construct.cfnReadinessCheck(
  id: String,
  props: CfnReadinessCheckProps,
  initializer: CfnReadinessCheck.() -> Unit = {},
): CfnReadinessCheck = CfnReadinessCheck(this, id, props).apply(initializer)
