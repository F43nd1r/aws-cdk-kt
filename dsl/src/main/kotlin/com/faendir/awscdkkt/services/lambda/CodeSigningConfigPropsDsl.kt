package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CodeSigningConfigProps

@Generated
public fun codeSigningConfigProps(initializer: CodeSigningConfigProps.Builder.() -> Unit = {}):
    CodeSigningConfigProps = CodeSigningConfigProps.builder().apply(initializer).build()
