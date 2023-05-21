package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint
import software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceUpdateConstraint(
  id: String,
  props: CfnResourceUpdateConstraintProps,
  initializer: CfnResourceUpdateConstraint.() -> Unit = {},
): CfnResourceUpdateConstraint = CfnResourceUpdateConstraint(this, id, props).apply(initializer)
