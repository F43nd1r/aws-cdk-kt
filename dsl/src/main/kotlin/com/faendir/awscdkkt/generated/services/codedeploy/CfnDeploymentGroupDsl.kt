package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeploymentGroup(
  id: String,
  props: CfnDeploymentGroupProps,
  initializer: @AwsCdkDsl CfnDeploymentGroup.() -> Unit = {},
): CfnDeploymentGroup = CfnDeploymentGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeploymentGroup(id: String, initializer: @AwsCdkDsl CfnDeploymentGroup.Builder.() -> Unit = {}): CfnDeploymentGroup = CfnDeploymentGroup.Builder.create(this, id).apply(initializer).build()
