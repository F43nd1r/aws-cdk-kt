package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsApplication
import software.amazon.awscdk.services.codedeploy.EcsApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.ecsApplication(id: String, initializer: EcsApplication.() -> Unit = {}):
    EcsApplication = EcsApplication(this, id).apply(initializer)

@Generated
public fun Construct.ecsApplication(
  id: String,
  props: EcsApplicationProps,
  initializer: EcsApplication.() -> Unit = {},
): EcsApplication = EcsApplication(this, id, props).apply(initializer)
