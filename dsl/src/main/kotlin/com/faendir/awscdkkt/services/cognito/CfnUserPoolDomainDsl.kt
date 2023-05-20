@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolDomain
import software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps
import software.constructs.Construct

public fun Construct.cfnUserPoolDomain(
  id: String,
  props: CfnUserPoolDomainProps,
  initializer: CfnUserPoolDomain.() -> Unit = {},
): CfnUserPoolDomain = CfnUserPoolDomain(this, id, props).apply(initializer)
