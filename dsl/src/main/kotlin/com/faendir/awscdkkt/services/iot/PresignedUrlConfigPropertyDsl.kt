@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnJobTemplate

public
    fun presignedUrlConfigProperty(initializer: CfnJobTemplate.PresignedUrlConfigProperty.Builder.() -> Unit):
    CfnJobTemplate.PresignedUrlConfigProperty =
    CfnJobTemplate.PresignedUrlConfigProperty.builder().apply(initializer).build()
