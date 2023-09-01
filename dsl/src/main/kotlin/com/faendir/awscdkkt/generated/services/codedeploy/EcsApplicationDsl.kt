package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsApplication
import software.amazon.awscdk.services.codedeploy.EcsApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.ecsApplication(id: String, initializer: @AwsCdkDsl EcsApplication.() -> Unit =
    {}): EcsApplication = EcsApplication(this, id).apply(initializer)

@Generated
public fun Construct.ecsApplication(
  id: String,
  props: EcsApplicationProps,
  initializer: @AwsCdkDsl EcsApplication.() -> Unit = {},
): EcsApplication = EcsApplication(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEcsApplication(id: String, initializer: @AwsCdkDsl
    EcsApplication.Builder.() -> Unit = {}): EcsApplication = EcsApplication.Builder.create(this,
    id).apply(initializer).build()
