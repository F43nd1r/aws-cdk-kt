package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CodeSigningConfig
import software.amazon.awscdk.services.lambda.CodeSigningConfigProps
import software.constructs.Construct

@Generated
public fun Construct.codeSigningConfig(
  id: String,
  props: CodeSigningConfigProps,
  initializer: CodeSigningConfig.() -> Unit = {},
): CodeSigningConfig = CodeSigningConfig(this, id, props).apply(initializer)
