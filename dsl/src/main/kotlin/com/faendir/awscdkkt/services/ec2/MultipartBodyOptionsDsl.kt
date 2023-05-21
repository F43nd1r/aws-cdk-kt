package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.MultipartBodyOptions

@Generated
public fun multipartBodyOptions(initializer: MultipartBodyOptions.Builder.() -> Unit = {}):
    MultipartBodyOptions = MultipartBodyOptions.builder().apply(initializer).build()
