package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.ServerApplication
import software.amazon.awscdk.services.codedeploy.ServerApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.serverApplication(id: String, initializer: @AwsCdkDsl
    ServerApplication.() -> Unit = {}): ServerApplication = ServerApplication(this,
    id).apply(initializer)

@Generated
public fun Construct.serverApplication(
  id: String,
  props: ServerApplicationProps,
  initializer: @AwsCdkDsl ServerApplication.() -> Unit = {},
): ServerApplication = ServerApplication(this, id, props).apply(initializer)

@Generated
public fun Construct.buildServerApplication(id: String, initializer: @AwsCdkDsl
    ServerApplication.Builder.() -> Unit = {}): ServerApplication =
    ServerApplication.Builder.create(this, id).apply(initializer).build()
