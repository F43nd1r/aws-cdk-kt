@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.ServerApplication
import software.amazon.awscdk.services.codedeploy.ServerApplicationProps
import software.constructs.Construct

public fun Construct.serverApplication(id: String, initializer: ServerApplication.() -> Unit = {}):
    ServerApplication = ServerApplication(this, id).apply(initializer)

public fun Construct.serverApplication(
  id: String,
  props: ServerApplicationProps,
  initializer: ServerApplication.() -> Unit = {},
): ServerApplication = ServerApplication(this, id, props).apply(initializer)
