@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps
import software.constructs.Construct

public fun Construct.cfnCodeSigningConfig(
  id: String,
  props: CfnCodeSigningConfigProps,
  initializer: CfnCodeSigningConfig.() -> Unit = {},
): CfnCodeSigningConfig = CfnCodeSigningConfig(this, id, props).apply(initializer)
