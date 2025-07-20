package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnStackSetConstraint.() -> Unit = {},
): CfnStackSetConstraint = CfnStackSetConstraint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStackSetConstraint(id: String, initializer: @AwsCdkDsl CfnStackSetConstraint.Builder.() -> Unit = {}): CfnStackSetConstraint = CfnStackSetConstraint.Builder.create(this, id).apply(initializer).build()
