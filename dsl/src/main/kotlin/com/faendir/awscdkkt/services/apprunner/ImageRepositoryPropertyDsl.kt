package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

@Generated
public
    fun imageRepositoryProperty(initializer: CfnService.ImageRepositoryProperty.Builder.() -> Unit =
    {}): CfnService.ImageRepositoryProperty =
    CfnService.ImageRepositoryProperty.builder().apply(initializer).build()
