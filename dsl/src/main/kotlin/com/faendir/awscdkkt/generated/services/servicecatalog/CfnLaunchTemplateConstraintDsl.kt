package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnLaunchTemplateConstraint.() -> Unit = {},
): CfnLaunchTemplateConstraint = CfnLaunchTemplateConstraint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLaunchTemplateConstraint(id: String, initializer: @AwsCdkDsl CfnLaunchTemplateConstraint.Builder.() -> Unit = {}): CfnLaunchTemplateConstraint = CfnLaunchTemplateConstraint.Builder.create(this, id).apply(initializer).build()
