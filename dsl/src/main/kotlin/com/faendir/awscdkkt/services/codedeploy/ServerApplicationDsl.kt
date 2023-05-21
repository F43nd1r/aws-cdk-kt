package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.ServerApplication
import software.amazon.awscdk.services.codedeploy.ServerApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.serverApplication(id: String, initializer: ServerApplication.() -> Unit = {}):
    ServerApplication = ServerApplication(this, id).apply(initializer)

@Generated
public fun Construct.serverApplication(
  id: String,
  props: ServerApplicationProps,
  initializer: ServerApplication.() -> Unit = {},
): ServerApplication = ServerApplication(this, id, props).apply(initializer)
