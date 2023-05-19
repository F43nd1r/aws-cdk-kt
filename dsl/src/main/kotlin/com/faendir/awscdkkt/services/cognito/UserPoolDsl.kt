@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPool
import software.amazon.awscdk.services.cognito.UserPoolProps
import software.constructs.Construct

public fun Construct.userPool(id: String, initializer: UserPool.() -> Unit = {}): UserPool =
    UserPool(this, id).apply(initializer)

public fun Construct.userPool(
  id: String,
  props: UserPoolProps,
  initializer: UserPool.() -> Unit = {},
): UserPool = UserPool(this, id, props).apply(initializer)
