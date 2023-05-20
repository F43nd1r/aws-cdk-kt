@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolResourceServer
import software.amazon.awscdk.services.cognito.UserPoolResourceServerProps
import software.constructs.Construct

public fun Construct.userPoolResourceServer(
  id: String,
  props: UserPoolResourceServerProps,
  initializer: UserPoolResourceServer.() -> Unit = {},
): UserPoolResourceServer = UserPoolResourceServer(this, id, props).apply(initializer)
