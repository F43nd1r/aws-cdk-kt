@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
