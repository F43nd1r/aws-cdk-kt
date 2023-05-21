package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLaunchNotificationConstraint(
  id: String,
  props: CfnLaunchNotificationConstraintProps,
  initializer: CfnLaunchNotificationConstraint.() -> Unit = {},
): CfnLaunchNotificationConstraint = CfnLaunchNotificationConstraint(this, id,
    props).apply(initializer)
