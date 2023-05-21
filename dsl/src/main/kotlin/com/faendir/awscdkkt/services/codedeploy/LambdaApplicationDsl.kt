package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.LambdaApplication
import software.amazon.awscdk.services.codedeploy.LambdaApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.lambdaApplication(id: String, initializer: LambdaApplication.() -> Unit = {}):
    LambdaApplication = LambdaApplication(this, id).apply(initializer)

@Generated
public fun Construct.lambdaApplication(
  id: String,
  props: LambdaApplicationProps,
  initializer: LambdaApplication.() -> Unit = {},
): LambdaApplication = LambdaApplication(this, id, props).apply(initializer)
