@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolClient
import software.amazon.awscdk.services.cognito.CfnUserPoolClientProps
import software.constructs.Construct

public fun Construct.cfnUserPoolClient(
  id: String,
  props: CfnUserPoolClientProps,
  initializer: CfnUserPoolClient.() -> Unit = {},
): CfnUserPoolClient = CfnUserPoolClient(this, id, props).apply(initializer)
