package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolResourceServer
import software.amazon.awscdk.services.cognito.UserPoolResourceServerProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolResourceServer(
  id: String,
  props: UserPoolResourceServerProps,
  initializer: UserPoolResourceServer.() -> Unit = {},
): UserPoolResourceServer = UserPoolResourceServer(this, id, props).apply(initializer)
