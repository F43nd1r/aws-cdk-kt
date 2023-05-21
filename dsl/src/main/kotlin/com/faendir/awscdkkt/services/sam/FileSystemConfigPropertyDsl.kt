package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun fileSystemConfigProperty(initializer: CfnFunction.FileSystemConfigProperty.Builder.() -> Unit
    = {}): CfnFunction.FileSystemConfigProperty =
    CfnFunction.FileSystemConfigProperty.builder().apply(initializer).build()
