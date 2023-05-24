package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.LambdaApplication
import software.amazon.awscdk.services.codedeploy.LambdaApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.lambdaApplication(id: String): LambdaApplication = LambdaApplication(this, id)

@Generated
public fun Construct.lambdaApplication(id: String, initializer: @AwsCdkDsl
    LambdaApplication.() -> Unit): LambdaApplication = LambdaApplication(this,
    id).apply(initializer)

@Generated
public fun Construct.lambdaApplication(id: String, props: LambdaApplicationProps): LambdaApplication
    = LambdaApplication(this, id, props)

@Generated
public fun Construct.lambdaApplication(
  id: String,
  props: LambdaApplicationProps,
  initializer: @AwsCdkDsl LambdaApplication.() -> Unit,
): LambdaApplication = LambdaApplication(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLambdaApplication(id: String, initializer: @AwsCdkDsl
    LambdaApplication.Builder.() -> Unit): LambdaApplication =
    LambdaApplication.Builder.create(this, id).apply(initializer).build()
