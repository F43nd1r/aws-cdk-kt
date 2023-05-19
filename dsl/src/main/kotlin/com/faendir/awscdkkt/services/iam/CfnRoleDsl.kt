@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnRole
import software.amazon.awscdk.services.iam.CfnRoleProps
import software.constructs.Construct

public fun Construct.cfnRole(
  id: String,
  props: CfnRoleProps,
  initializer: CfnRole.() -> Unit = {},
): CfnRole = CfnRole(this, id, props).apply(initializer)
