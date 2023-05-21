package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps
import software.constructs.Construct

@Generated
public fun Construct.serverDeploymentGroup(id: String, initializer: ServerDeploymentGroup.() -> Unit
    = {}): ServerDeploymentGroup = ServerDeploymentGroup(this, id).apply(initializer)

@Generated
public fun Construct.serverDeploymentGroup(
  id: String,
  props: ServerDeploymentGroupProps,
  initializer: ServerDeploymentGroup.() -> Unit = {},
): ServerDeploymentGroup = ServerDeploymentGroup(this, id, props).apply(initializer)
