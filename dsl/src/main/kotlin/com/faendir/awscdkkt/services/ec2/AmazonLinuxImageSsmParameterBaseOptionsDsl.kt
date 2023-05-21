package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseOptions

@Generated
public
    fun amazonLinuxImageSsmParameterBaseOptions(initializer: AmazonLinuxImageSsmParameterBaseOptions.Builder.() -> Unit
    = {}): AmazonLinuxImageSsmParameterBaseOptions =
    AmazonLinuxImageSsmParameterBaseOptions.builder().apply(initializer).build()
