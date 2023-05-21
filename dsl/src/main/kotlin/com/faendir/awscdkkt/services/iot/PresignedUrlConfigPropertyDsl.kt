package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnJobTemplate

@Generated
public
    fun presignedUrlConfigProperty(initializer: CfnJobTemplate.PresignedUrlConfigProperty.Builder.() -> Unit
    = {}): CfnJobTemplate.PresignedUrlConfigProperty =
    CfnJobTemplate.PresignedUrlConfigProperty.builder().apply(initializer).build()
