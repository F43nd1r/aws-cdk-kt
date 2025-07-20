package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnLaunchNotificationConstraint.() -> Unit = {},
): CfnLaunchNotificationConstraint = CfnLaunchNotificationConstraint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLaunchNotificationConstraint(id: String, initializer: @AwsCdkDsl CfnLaunchNotificationConstraint.Builder.() -> Unit = {}): CfnLaunchNotificationConstraint = CfnLaunchNotificationConstraint.Builder.create(this, id).apply(initializer).build()
