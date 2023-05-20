@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPool
import software.amazon.awscdk.services.cognito.UserPoolProps
import software.constructs.Construct

public fun Construct.userPool(
  id: String,
  props: UserPoolProps,
  initializer: UserPool.() -> Unit = {},
): UserPool = UserPool(this, id, props).apply(initializer)

public fun Construct.userPool(id: String, initializer: UserPool.() -> Unit = {}): UserPool =
    UserPool(this, id).apply(initializer)
