@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolDomain
import software.amazon.awscdk.services.cognito.UserPoolDomainProps
import software.constructs.Construct

public fun Construct.userPoolDomain(
  id: String,
  props: UserPoolDomainProps,
  initializer: UserPoolDomain.() -> Unit = {},
): UserPoolDomain = UserPoolDomain(this, id, props).apply(initializer)
