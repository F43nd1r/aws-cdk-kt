package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolDomain
import software.amazon.awscdk.services.cognito.UserPoolDomainProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolDomain(
  id: String,
  props: UserPoolDomainProps,
  initializer: UserPoolDomain.() -> Unit = {},
): UserPoolDomain = UserPoolDomain(this, id, props).apply(initializer)
