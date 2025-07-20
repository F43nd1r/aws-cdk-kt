package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLaunchRoleConstraint(
  id: String,
  props: CfnLaunchRoleConstraintProps,
  initializer: @AwsCdkDsl CfnLaunchRoleConstraint.() -> Unit = {},
): CfnLaunchRoleConstraint = CfnLaunchRoleConstraint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLaunchRoleConstraint(id: String, initializer: @AwsCdkDsl CfnLaunchRoleConstraint.Builder.() -> Unit = {}): CfnLaunchRoleConstraint = CfnLaunchRoleConstraint.Builder.create(this, id).apply(initializer).build()
