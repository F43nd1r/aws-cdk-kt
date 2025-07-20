package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps
import software.constructs.Construct

@Generated
public fun Construct.lambdaDeploymentGroup(
  id: String,
  props: LambdaDeploymentGroupProps,
  initializer: @AwsCdkDsl LambdaDeploymentGroup.() -> Unit = {},
): LambdaDeploymentGroup = LambdaDeploymentGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLambdaDeploymentGroup(id: String, initializer: @AwsCdkDsl LambdaDeploymentGroup.Builder.() -> Unit = {}): LambdaDeploymentGroup = LambdaDeploymentGroup.Builder.create(this, id).apply(initializer).build()
