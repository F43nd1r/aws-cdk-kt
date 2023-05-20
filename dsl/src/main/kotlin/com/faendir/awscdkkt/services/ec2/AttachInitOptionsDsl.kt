@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AttachInitOptions

public fun attachInitOptions(initializer: AttachInitOptions.Builder.() -> Unit): AttachInitOptions =
    AttachInitOptions.builder().apply(initializer).build()
