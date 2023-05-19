@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsApplication
import software.amazon.awscdk.services.codedeploy.EcsApplicationProps
import software.constructs.Construct

public fun Construct.ecsApplication(id: String, initializer: EcsApplication.() -> Unit = {}):
    EcsApplication = EcsApplication(this, id).apply(initializer)

public fun Construct.ecsApplication(
  id: String,
  props: EcsApplicationProps,
  initializer: EcsApplication.() -> Unit = {},
): EcsApplication = EcsApplication(this, id, props).apply(initializer)
