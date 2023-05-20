@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kms.CfnKeyProps

public fun cfnKeyProps(initializer: CfnKeyProps.Builder.() -> Unit): CfnKeyProps =
    CfnKeyProps.builder().apply(initializer).build()
