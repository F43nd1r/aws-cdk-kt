package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.AccessKeyProps

@Generated
public fun accessKeyProps(initializer: AccessKeyProps.Builder.() -> Unit = {}): AccessKeyProps =
    AccessKeyProps.builder().apply(initializer).build()
