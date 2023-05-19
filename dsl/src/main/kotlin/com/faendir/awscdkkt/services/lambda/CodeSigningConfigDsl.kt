@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
