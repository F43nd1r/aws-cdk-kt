@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint
import software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps
import software.constructs.Construct

public fun Construct.cfnStackSetConstraint(
  id: String,
  props: CfnStackSetConstraintProps,
  initializer: CfnStackSetConstraint.() -> Unit = {},
): CfnStackSetConstraint = CfnStackSetConstraint(this, id, props).apply(initializer)
