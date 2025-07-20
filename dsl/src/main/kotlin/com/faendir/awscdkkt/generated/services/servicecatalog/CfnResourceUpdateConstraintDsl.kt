package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnResourceUpdateConstraint.() -> Unit = {},
): CfnResourceUpdateConstraint = CfnResourceUpdateConstraint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceUpdateConstraint(id: String, initializer: @AwsCdkDsl CfnResourceUpdateConstraint.Builder.() -> Unit = {}): CfnResourceUpdateConstraint = CfnResourceUpdateConstraint.Builder.create(this, id).apply(initializer).build()
