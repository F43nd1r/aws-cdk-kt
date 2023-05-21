package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnAccessKeyProps

@Generated
public fun cfnAccessKeyProps(initializer: CfnAccessKeyProps.Builder.() -> Unit = {}):
    CfnAccessKeyProps = CfnAccessKeyProps.builder().apply(initializer).build()
