@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.LambdaApplication
import software.amazon.awscdk.services.codedeploy.LambdaApplicationProps
import software.constructs.Construct

public fun Construct.lambdaApplication(id: String, initializer: LambdaApplication.() -> Unit = {}):
    LambdaApplication = LambdaApplication(this, id).apply(initializer)

public fun Construct.lambdaApplication(
  id: String,
  props: LambdaApplicationProps,
  initializer: LambdaApplication.() -> Unit = {},
): LambdaApplication = LambdaApplication(this, id, props).apply(initializer)
