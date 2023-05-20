@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps
import software.constructs.Construct

public fun Construct.cfnLaunchNotificationConstraint(
  id: String,
  props: CfnLaunchNotificationConstraintProps,
  initializer: CfnLaunchNotificationConstraint.() -> Unit = {},
): CfnLaunchNotificationConstraint = CfnLaunchNotificationConstraint(this, id,
    props).apply(initializer)
