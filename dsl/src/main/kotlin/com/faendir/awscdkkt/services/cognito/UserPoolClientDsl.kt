package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolClient
import software.amazon.awscdk.services.cognito.UserPoolClientProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolClient(
  id: String,
  props: UserPoolClientProps,
  initializer: UserPoolClient.() -> Unit = {},
): UserPoolClient = UserPoolClient(this, id, props).apply(initializer)
