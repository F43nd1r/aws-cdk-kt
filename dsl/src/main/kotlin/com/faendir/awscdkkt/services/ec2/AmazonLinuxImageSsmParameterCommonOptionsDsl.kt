package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions

@Generated
public
    fun amazonLinuxImageSsmParameterCommonOptions(initializer: AmazonLinuxImageSsmParameterCommonOptions.Builder.() -> Unit
    = {}): AmazonLinuxImageSsmParameterCommonOptions =
    AmazonLinuxImageSsmParameterCommonOptions.builder().apply(initializer).build()
