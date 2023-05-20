@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
