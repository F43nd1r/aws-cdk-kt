package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig

@Generated
public
    fun allowedPublishersProperty(initializer: CfnCodeSigningConfig.AllowedPublishersProperty.Builder.() -> Unit
    = {}): CfnCodeSigningConfig.AllowedPublishersProperty =
    CfnCodeSigningConfig.AllowedPublishersProperty.builder().apply(initializer).build()
