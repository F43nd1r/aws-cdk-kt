package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps
import software.constructs.Construct

@Generated
public fun Construct.ecsDeploymentGroup(id: String, props: EcsDeploymentGroupProps):
    EcsDeploymentGroup = EcsDeploymentGroup(this, id, props)

@Generated
public fun Construct.ecsDeploymentGroup(
  id: String,
  props: EcsDeploymentGroupProps,
  initializer: @AwsCdkDsl EcsDeploymentGroup.() -> Unit,
): EcsDeploymentGroup = EcsDeploymentGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEcsDeploymentGroup(id: String, initializer: @AwsCdkDsl
    EcsDeploymentGroup.Builder.() -> Unit): EcsDeploymentGroup =
    EcsDeploymentGroup.Builder.create(this, id).apply(initializer).build()
