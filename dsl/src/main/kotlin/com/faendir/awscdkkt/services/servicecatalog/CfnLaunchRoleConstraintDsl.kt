@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps
import software.constructs.Construct

public fun Construct.cfnLaunchRoleConstraint(
  id: String,
  props: CfnLaunchRoleConstraintProps,
  initializer: CfnLaunchRoleConstraint.() -> Unit = {},
): CfnLaunchRoleConstraint = CfnLaunchRoleConstraint(this, id, props).apply(initializer)
