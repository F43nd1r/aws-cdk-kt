package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

@Generated
public fun codeRepositoryProperty(initializer: CfnService.CodeRepositoryProperty.Builder.() -> Unit
    = {}): CfnService.CodeRepositoryProperty =
    CfnService.CodeRepositoryProperty.builder().apply(initializer).build()
