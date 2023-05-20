@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint
import software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps
import software.constructs.Construct

public fun Construct.cfnResourceUpdateConstraint(
  id: String,
  props: CfnResourceUpdateConstraintProps,
  initializer: CfnResourceUpdateConstraint.() -> Unit = {},
): CfnResourceUpdateConstraint = CfnResourceUpdateConstraint(this, id, props).apply(initializer)
