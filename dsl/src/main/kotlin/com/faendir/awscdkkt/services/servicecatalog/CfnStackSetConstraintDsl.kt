package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint
import software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStackSetConstraint(
  id: String,
  props: CfnStackSetConstraintProps,
  initializer: CfnStackSetConstraint.() -> Unit = {},
): CfnStackSetConstraint = CfnStackSetConstraint(this, id, props).apply(initializer)
