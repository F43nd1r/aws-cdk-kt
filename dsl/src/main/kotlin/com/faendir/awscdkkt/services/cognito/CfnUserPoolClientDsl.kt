package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolClient
import software.amazon.awscdk.services.cognito.CfnUserPoolClientProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolClient(
  id: String,
  props: CfnUserPoolClientProps,
  initializer: CfnUserPoolClient.() -> Unit = {},
): CfnUserPoolClient = CfnUserPoolClient(this, id, props).apply(initializer)
