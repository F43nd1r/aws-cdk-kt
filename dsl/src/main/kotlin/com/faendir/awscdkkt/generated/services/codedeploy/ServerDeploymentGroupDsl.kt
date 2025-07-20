package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps
import software.constructs.Construct

@Generated
public fun Construct.serverDeploymentGroup(id: String, initializer: @AwsCdkDsl ServerDeploymentGroup.() -> Unit = {}): ServerDeploymentGroup = ServerDeploymentGroup(this, id).apply(initializer)

@Generated
public fun Construct.serverDeploymentGroup(
  id: String,
  props: ServerDeploymentGroupProps,
  initializer: @AwsCdkDsl ServerDeploymentGroup.() -> Unit = {},
): ServerDeploymentGroup = ServerDeploymentGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildServerDeploymentGroup(id: String, initializer: @AwsCdkDsl ServerDeploymentGroup.Builder.() -> Unit = {}): ServerDeploymentGroup = ServerDeploymentGroup.Builder.create(this, id).apply(initializer).build()
