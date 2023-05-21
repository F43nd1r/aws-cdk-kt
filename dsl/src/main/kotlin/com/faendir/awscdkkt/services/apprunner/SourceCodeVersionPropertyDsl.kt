package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

@Generated
public
    fun sourceCodeVersionProperty(initializer: CfnService.SourceCodeVersionProperty.Builder.() -> Unit
    = {}): CfnService.SourceCodeVersionProperty =
    CfnService.SourceCodeVersionProperty.builder().apply(initializer).build()
