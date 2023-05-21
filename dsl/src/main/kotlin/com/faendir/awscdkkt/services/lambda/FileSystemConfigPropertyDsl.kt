package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

@Generated
public
    fun fileSystemConfigProperty(initializer: CfnFunction.FileSystemConfigProperty.Builder.() -> Unit
    = {}): CfnFunction.FileSystemConfigProperty =
    CfnFunction.FileSystemConfigProperty.builder().apply(initializer).build()
