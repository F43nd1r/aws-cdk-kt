@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CodeSigningConfig
import software.amazon.awscdk.services.lambda.CodeSigningConfigProps
import software.constructs.Construct

public fun Construct.codeSigningConfig(
  id: String,
  props: CodeSigningConfigProps,
  initializer: CodeSigningConfig.() -> Unit = {},
): CodeSigningConfig = CodeSigningConfig(this, id, props).apply(initializer)
