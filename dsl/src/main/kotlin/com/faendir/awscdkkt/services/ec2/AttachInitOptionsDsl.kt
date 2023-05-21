package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AttachInitOptions

@Generated
public fun attachInitOptions(initializer: AttachInitOptions.Builder.() -> Unit = {}):
    AttachInitOptions = AttachInitOptions.builder().apply(initializer).build()
