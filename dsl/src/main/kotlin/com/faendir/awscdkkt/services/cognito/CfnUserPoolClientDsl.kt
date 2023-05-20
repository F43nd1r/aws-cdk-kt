@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
