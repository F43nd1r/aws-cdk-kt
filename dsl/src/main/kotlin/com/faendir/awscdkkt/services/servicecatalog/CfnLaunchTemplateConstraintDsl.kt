package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLaunchTemplateConstraint(
  id: String,
  props: CfnLaunchTemplateConstraintProps,
  initializer: CfnLaunchTemplateConstraint.() -> Unit = {},
): CfnLaunchTemplateConstraint = CfnLaunchTemplateConstraint(this, id, props).apply(initializer)
