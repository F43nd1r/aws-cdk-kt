package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnApiKey
import software.amazon.awscdk.services.apigateway.CfnApiKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApiKey(id: String, initializer: CfnApiKey.() -> Unit = {}): CfnApiKey =
    CfnApiKey(this, id).apply(initializer)

@Generated
public fun Construct.cfnApiKey(
  id: String,
  props: CfnApiKeyProps,
  initializer: CfnApiKey.() -> Unit = {},
): CfnApiKey = CfnApiKey(this, id, props).apply(initializer)
