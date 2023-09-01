package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CodeSigningConfig.() -> Unit = {},
): CodeSigningConfig = CodeSigningConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCodeSigningConfig(id: String, initializer: @AwsCdkDsl
    CodeSigningConfig.Builder.() -> Unit = {}): CodeSigningConfig =
    CodeSigningConfig.Builder.create(this, id).apply(initializer).build()
