@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps
import software.constructs.Construct

public fun Construct.cfnUserPoolResourceServer(
  id: String,
  props: CfnUserPoolResourceServerProps,
  initializer: CfnUserPoolResourceServer.() -> Unit = {},
): CfnUserPoolResourceServer = CfnUserPoolResourceServer(this, id, props).apply(initializer)
