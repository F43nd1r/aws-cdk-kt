@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnApiKey
import software.amazon.awscdk.services.appsync.CfnApiKeyProps
import software.constructs.Construct

public fun Construct.cfnApiKey(
  id: String,
  props: CfnApiKeyProps,
  initializer: CfnApiKey.() -> Unit = {},
): CfnApiKey = CfnApiKey(this, id, props).apply(initializer)
